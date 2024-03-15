package com.Booking.Hotel.repository;

import com.Booking.Hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
