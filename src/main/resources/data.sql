CREATE TABLE IF NOT EXISTS Customers (
                                      "id" INT(100) NOT NULL auto_increment,
                                      "car_type" VARCHAR(200),
                                      "first_name" VARCHAR(200),
                                      "last_name" VARCHAR(200),
                                      "mail" VARCHAR(200),
                                      "phone" INT(8),
                                      PRIMARY KEY ("id"));

CREATE TABLE IF NOT EXISTS Bookings(
                                   "id"            INT(100) NOT NULL auto_increment,
                                   "addition"      VARCHAR(200),
                                   "size"          VARCHAR(200),
                                   "status"    VARCHAR(200),
                                   "license_plate"  VARCHAR(7),
                                   "customer_id"     INT(100),
                                   `date` TIMESTAMP NOT NULL DEFAULT CURRENT_DATE(),
                                   PRIMARY KEY ("id"),
                                   FOREIGN KEY ("customer_id")
                                       REFERENCES Customers(id));

-- data to be inserted into tables
INSERT INTO Customers(car_type,first_name,last_name,mail,phone)
VALUES ('SUV',      'Per','Johansen',       'perj94@mail.com',      52484800),
       ('Micro',    'Kenneth','Sørensen',   'ksørensen@mail.com',   22842094),
       ('Sedan',    'Sarah','Hansen',       'sarhan@mail.com',      39462038),
       ('Sedan',    'Ditte','Jensen',       'ditjen@mail.com',      29374834),
       ('Micro',    'Noah','Fenster',       'noahf@mail.com',       67354637),
       ('SUV',      'Alexander','Poersmose', 'alpor@mail.com',      22643748),
       ('Micro',    'Louis','Cruton',       'lc@mail.com',          24252501),
       ('Micro',    'Kristian','Deeznuts',  'krisnuts@mail.com',    24348210);

INSERT INTO Bookings(addition, size, status, license_plate, date)
VALUES ('none',     'SUV',      'true',   'CK12345',    '2020-01-13 09:13:41'),
       ('polering', 'Micro',    'false',  'AE10808',    '2020-01-15 14:48:11'),
       ('none',     'Sedan',    'true',   'BM74823',    '2020-01-17 10:45:42'),
       ('hundehår', 'Sedan',    'false',  'CS83239',    '2020-01-21 13:34:15'),
       ('none',     'Micro',    'true',   'DJ20842',    '2020-01-21 17:03:44'),
       ('none',     'SUV',      'true',   'IK39042',    '2020-01-22 21:12:37'),
       ('polering', 'Micro',    'false',  'DI49024',    '2020-01-24 07:54:21'),
       ('none',     'Micro',    'true',   'OO49024',    '2020-02-01 34:42:14');