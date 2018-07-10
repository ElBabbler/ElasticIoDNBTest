package com.denys.actions;

import com.denys.models.OrderProductRequestM;
import com.denys.utils.RequestManualSender;
import com.denys.utils.RequestMapper;
import com.denys.utils.RequestSender;
import com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductRequest;
import com.dnb.services.NewsAndMediaProductServiceV2_0.OrderProductResponse;
import com.google.gson.Gson;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;
import io.elastic.api.Module;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.StringReader;

/**
 * Action to create a pet.
 */
public class ApiCall implements Module {
    private static final Logger logger = LoggerFactory.getLogger(ApiCall.class);

    private Gson gson = new Gson();

    private RequestSender requestSender = new RequestManualSender();

    /**
     * Executes the actions's logic by sending a request to the Petstore API and emitting response to the platform.
     *
     * @param parameters execution parameters
     */
    @Override
    public void execute(final ExecutionParameters parameters) {
        // incoming message
        final Message message = parameters.getMessage();

//        // body contains the mapped data
        final JsonObject body = message.getBody();

        OrderProductRequestM requestM = gson.fromJson(body.toString(), OrderProductRequestM.class);

        OrderProductRequest orderProductRequest = RequestMapper.mapRequest(requestM);
        OrderProductResponse response = requestSender.sendSoapRequest(orderProductRequest);

        JsonReader jsonReader = Json.createReader(new StringReader(gson.toJson(response)));
        JsonObject reply = jsonReader.readObject();

        final Message data = new Message.Builder().body(reply).build();

        parameters.getEventEmitter().emitData(data);
    }
}
