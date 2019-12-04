package com.siva.tarento.dao;

import org.springframework.data.repository.CrudRepository;

import com.siva.tarento.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
