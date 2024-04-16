package com.projetos.apieventsmicroservice.repositories;

import com.projetos.apieventsmicroservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
