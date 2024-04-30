CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
CREATE TABLE transaction (
    id UUID PRIMARY KEY NOT NULL DEFAULT uuid_generate_v4(),
    sender_id UUID NOT NULL,
    receiver_id UUID NOT NULL,
    amount NUMERIC NOT NULL
);