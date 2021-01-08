
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

INSERT INTO Bookings(addition, size, status, license_plate, date,customer_id)
VALUES ('none',     'SUV',      'true',   'CK12345',    '2020-01-13 09:13:41',1),
       ('polering', 'Micro',    'false',  'AE10808',    '2020-01-15 14:48:11',4),
       ('none',     'Sedan',    'true',   'BM74823',    '2020-01-17 10:45:42',1),
       ('hundehår', 'Sedan',    'false',  'CS83239',    '2020-01-21 13:34:15',4),
       ('none',     'Micro',    'true',   'DJ20842',    '2020-01-21 17:03:44',5),
       ('none',     'SUV',      'true',   'IK39042',    '2020-01-22 21:12:37',6),
       ('polering', 'Micro',    'false',  'DI49024',    '2020-01-24 07:54:21',7),
       ('none',     'Micro',    'true',   'OO49024',    '2020-02-01 34:42:14',3);