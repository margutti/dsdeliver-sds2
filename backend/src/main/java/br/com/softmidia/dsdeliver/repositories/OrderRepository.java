package br.com.softmidia.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.softmidia.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
