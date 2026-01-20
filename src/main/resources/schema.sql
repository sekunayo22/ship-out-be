CREATE SEQUENCE IF NOT EXISTS booking_reference_seq;
CREATE SEQUENCE IF NOT EXISTS booking_master_bill_seq;
CREATE SEQUENCE IF NOT EXISTS booking_carrier_contract_seq;

ALTER TABLE IF EXISTS booking
    ALTER COLUMN IF EXISTS reference SET DEFAULT nextval('booking_reference_seq'),
    ALTER COLUMN IF EXISTS master_bill SET DEFAULT nextval('booking_master_bill_seq'),
    ALTER COLUMN IF EXISTS carrier_contract_number SET DEFAULT nextval('booking_carrier_contract_seq');
