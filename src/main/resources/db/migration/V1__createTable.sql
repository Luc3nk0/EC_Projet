create table IF NOT EXISTS cars (
                      id INT,
                      surname VARCHAR(50),
                      mark VARCHAR(50),
                      price INT,
                      description VARCHAR(100)
);
create table IF NOT EXISTS orders (
                      id INT,
                      customerid INT,
                      carlistorder VARCHAR(50)
);
