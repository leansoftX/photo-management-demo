-- 用户表
CREATE TABLE users (
  id INT PRIMARY KEY,
  name VARCHAR(255),
  email VARCHAR(255),
  address VARCHAR(255)
);

-- 订单表
CREATE TABLE orders (
  id INT PRIMARY KEY,
  user_id INT,
  order_date DATE,
  total_amount DECIMAL(10, 2),
  FOREIGN KEY (user_id) REFERENCES users(id)
);

-- 支付表
CREATE TABLE payments (
  id INT PRIMARY KEY,
  order_id INT,
  payment_date DATE,
  amount DECIMAL(10, 2),
  FOREIGN KEY (order_id) REFERENCES orders(id)
);


