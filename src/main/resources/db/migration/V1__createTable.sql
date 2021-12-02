create table IF NOT EXISTS cars (
                      id INT,
                      surname VARCHAR(50),
                      mark VARCHAR(50),
                      price INT,
                      description VARCHAR(100)
);
create table IF NOT EXISTS orders (
                      id INT,
                      customerId INT,
                      UUID uuid
);
create table IF NOT EXISTS items_car(
                      orderId INT,
                      carId INT,
);
create table IF NOT EXISTS customer(
                      id INT,
                      firstName VARCHAR(50),
                      lastName VARCHAR(50),
                      email VARCHAR(50)
);