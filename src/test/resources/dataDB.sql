INSERT INTO empl_positions(name_position) VALUES
                                              ('Concierge'),
                                              ('Maid'),
                                              ('Administrator'),
                                              ('Guard'),
                                              ('Cook'),
                                              ('Head');

INSERT INTO employee(name, surname, position_id) VALUES
                                                      ('Shamil', 'Shundalov', 6),
                                                      ('Sofia', 'Lipskyta', 3),
                                                      ('Maxim', 'Lavrov', 5),
                                                      ('Sveta', 'Popova', 2),
                                                      ('Andrey', 'Kievstoner', 4),
                                                      ('Alex', 'Down', 1),
                                                      ('Seva', 'Bulava', 3);

INSERT INTO services(name, price) VALUES
                                      ('Massage', 2500),
                                      ('SPA', 4500),
                                      ('Karaoke', 2500),
                                      ('gymnasium', 2000);

INSERT INTO rooms(number, price, status, size, people_now) VALUES
                                                               (10, 2100, 'common', 30, 1),
                                                               (11, 2500, 'common', 52, 2),
                                                               (12, 2300, 'common', 70, 0),
                                                               (13, 2500, 'common', 50, 1),
                                                               (14, 2700, 'comfort', 60, 1),
                                                               (15, 3500, 'comfort plus', 75, 3),
                                                               (20, 3600, 'comfort plus', 78, 0),
                                                               (21, 3450, 'comfort plus', 76, 0),
                                                               (22, 2200, 'comfort', 34, 0),
                                                               (23, 2200, 'comfort', 34, 0),
                                                               (24, 8000, 'VIP', 120, 1),
                                                               (25, 7300, 'VIP', 101, 0);

INSERT INTO guests(name, surname, age) VALUES
                                           ('Simon', 'Maxwell', 23),
                                           ('Bob', 'Dylan', 43),
                                           ('Vera', 'Kasyanova', 58),
                                           ('Sergey', 'Lazarev', 23),
                                           ('Oleg', 'Ivanov', 22),
                                           ('Alena', 'Kondratenko', 28),
                                           ('Leonid', 'Moiseev', 39),
                                           ('Akulbek', 'Nurgaziev', 26),
                                           ('Danial', 'Akhadov', 21),
                                           ('Alex', 'Morgan', 35),
                                           ('Johny', 'Keigh', 56),
                                           ('Misha', 'Lazarev', 39),
                                           ('Seva', 'Bulava', 23),
                                           ('Azat', 'Kushka', 34),
                                           ('Masha', 'Medvedeva', 48),
                                           ('Oleg', 'Gomolak', 61),
                                           ('Maxim', 'Samoylenko', 22);

INSERT INTO guest_registration(date_arrival, date_departure, empl_id, guest_id, room_id, is_currently_living) VALUES
                                                                                                                  ('2023-10-20 13:45:00', '2023-10-25 12:20:00', 1, 1, 1, false),
                                                                                                                  ('2023-10-22 13:49:23', null, 1, 2, 1, true),
                                                                                                                  ('2023-10-10 11:30:22', '2023-10-13 10:10:11', 1, 3, 2, false),
                                                                                                                  ('2023-10-10 11:30:22', null, 1, 4, 2, true),
                                                                                                                  ('2023-10-10 11:30:22', null, 2, 5, 2, true),
                                                                                                                  ('2023-10-05 20:45:00', '2023-10-25 18:28:20', 2, 6, 3, false),
                                                                                                                  ('2023-10-11 10:15:00',null, 7, 7, 5, true),
                                                                                                                  ('2023-10-11 10:15:00',null, 7, 8, 4, true),
                                                                                                                  ('2023-08-05 20:45:00', '2023-09-09 10:58:20', 7, 9, 5, false),
                                                                                                                  ('2023-02-05 22:49:00', '2023-02-20 18:02:21', 7, 10, 6, false),
                                                                                                                  ('2023-12-22 10:15:00',null, 2, 11, 6, true),
                                                                                                                  ('2023-12-22 10:15:00',null, 2, 12, 6, true),
                                                                                                                  ('2023-12-22 10:15:00',null, 2, 13, 6, true),
                                                                                                                  ('2023-01-05 20:45:00', '2023-01-13 18:28:20', 2, 14, 7, false),
                                                                                                                  ('2023-01-05 20:45:00', '2023-01-13 18:28:20', 2, 15, 7, false),
                                                                                                                  ('2023-01-05 20:45:00', '2023-01-13 18:28:20', 2, 16, 7, false),
                                                                                                                  ('2023-11-10 14:45:00',null, 1, 17, 11, true);


INSERT INTO registration_service(reg_id, serv_id, date_service) VALUES
                                                                    (1, 1, '2023-10-21 12:45:23'),
                                                                    (1, 2, '2023-10-22 17:22:13'),
                                                                    (1, 4, '2023-10-21 15:25:20'),
                                                                    (2, 1, '2023-10-12 12:45:00'),
                                                                    (2, 3, '2023-10-21 11:35:22'),
                                                                    (3, 2, '2023-10-14 20:10:23'),
                                                                    (5, 4, '2023-08-20 13:44:02'),
                                                                    (5, 3, '2023-08-09 10:13:29'),
                                                                    (7, 1, '2023-01-10 17:30:49'),
                                                                    (10, 4, '2023-02-06 12:45:23'),
                                                                    (11, 2, '2023-10-22 17:22:13'),
                                                                    (11, 4, '2023-10-21 15:25:20'),
                                                                    (3, 1, '2023-10-12 12:45:00');