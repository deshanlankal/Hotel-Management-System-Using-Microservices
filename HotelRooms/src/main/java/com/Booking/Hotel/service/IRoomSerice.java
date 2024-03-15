package com.Booking.Hotel.service;

import com.Booking.Hotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

public interface IRoomSerice {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;
}
