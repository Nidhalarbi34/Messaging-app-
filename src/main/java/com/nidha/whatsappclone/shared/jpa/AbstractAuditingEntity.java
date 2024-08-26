package com.nidha.whatsappclone.shared.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractAuditingEntity<T> {
    public abstract T getId();
    @CreatedDate
    @Column(updatable = false,name = "created_date")
    public Instant createdDate = Instant.now();

    @LastModifiedDate
    @Column(name = "last_modified_date")
    public Instant lastModifiedDate=Instant.now();

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}
/*
The AuditingEntityListener is a class provided by Spring Data JPA that enables automatic population of auditing fields, such as createdDate, lastModifiedDate, createdBy, and lastModifiedBy. These fields are commonly used to track who created or modified an entity and when. */