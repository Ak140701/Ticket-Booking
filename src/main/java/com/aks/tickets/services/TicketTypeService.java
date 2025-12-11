package com.aks.tickets.services;

import com.aks.tickets.domain.entities.Ticket;

import java.util.UUID;

public interface TicketTypeService {
    Ticket purchaseTicket(UUID userId,UUID ticketTypeId);
}
