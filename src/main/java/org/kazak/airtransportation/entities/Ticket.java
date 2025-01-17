package org.kazak.airtransportation.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.Map;

@Getter
@Setter
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @Size(max = 13)
    @Column(name = "ticket_no", nullable = false, length = 13)
    private String ticketNo;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_ref", nullable = false)
    private Booking bookRef;

    @Size(max = 20)
    @NotNull
    @Column(name = "passenger_id", nullable = false, length = 20)
    private String passengerId;

    @NotNull
    @Column(name = "passenger_name", nullable = false, length = Integer.MAX_VALUE)
    private String passengerName;

    @Column(name = "contact_data")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> contactData;

}