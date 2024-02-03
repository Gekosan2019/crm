CREATE TABLE empl_positions(
                               position_id INT AUTO_INCREMENT PRIMARY KEY,
                               name_position VARCHAR(40) NOT NULL
);

CREATE TABLE employee(
                          empl_id INT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(20) NOT NULL,
                          surname VARCHAR(40) NOT NULL,
                          position_id INT NOT NULL,
                          CONSTRAINT FK_position
                              FOREIGN KEY (position_id) REFERENCES empl_positions(position_id)
);

CREATE TABLE services(
                         service_id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(20) NOT NULL,
                         price INT NOT NULL
);

CREATE TABLE rooms(
                      room_id INT AUTO_INCREMENT PRIMARY KEY,
                      number INT NOT NULL,
                      price INT NOT NULL,
                      status VARCHAR(15) NOT NULL,
                      size INT NOT NULL,
                      people_now INT NOT NULL
);

CREATE TABLE guests(
                       guest_id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(20) NOT NULL,
                       surname VARCHAR(40) NOT NULL,
                       age INT NOT NULL
);

CREATE TABLE guest_registration(
                                   registration_id INT AUTO_INCREMENT PRIMARY KEY,
                                   date_arrival DATETIME NOT NULL,
                                   date_departure DATETIME,
                                   empl_id INT NOT NULL,
                                   guest_id INT NOT NULL,
                                   room_id INT NOT NULL,
                                   is_currently_living boolean NOT NULL,
                                   CONSTRAINT FK_employees
                                       FOREIGN KEY (empl_id) REFERENCES employee(empl_id),
                                   CONSTRAINT FK_guest
                                       FOREIGN KEY (guest_id) REFERENCES guests(guest_id) ON DELETE CASCADE,
                                   CONSTRAINT FK_rooms
                                       FOREIGN KEY (room_id) REFERENCES rooms(room_id)
);

CREATE TABLE registration_service(
                                     reg_id INT NOT NULL,
                                     serv_id INT NOT NULL,
                                     PRIMARY KEY (reg_id, serv_id),
                                     date_service DATETIME NOT NULL,
                                     CONSTRAINT FK_registration
                                         FOREIGN KEY (reg_id) REFERENCES guest_registration(registration_id) ON DELETE CASCADE,
                                     CONSTRAINT FK_service
                                         FOREIGN KEY (serv_id) REFERENCES services(service_id)
);