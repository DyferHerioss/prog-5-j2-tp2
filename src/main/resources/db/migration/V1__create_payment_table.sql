
CREATE TABLE IF NOT EXISTS payment (
                                       id UUID PRIMARY KEY,
                                       rental_id UUID NOT NULL REFERENCES rental(id) ON DELETE CASCADE,
    paid_amount NUMERIC NOT NULL,
    creation_date TIMESTAMP DEFAULT now(),
    update_date TIMESTAMP DEFAULT now()
    );