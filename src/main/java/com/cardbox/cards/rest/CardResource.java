package com.cardbox.cards.rest;

import com.cardbox.cards.dto.CardRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/cards")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CardResource {

    @POST
    public Response createCard(CardRequest request) {

        return Response.ok("Cartão com final x cadastrado com sucesso." ).build();
    }
}
