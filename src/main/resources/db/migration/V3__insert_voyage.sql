INSERT INTO voyage (id, service_string, vessel_id)
VALUES
(1,'LL6', 1),
(2,'LL6', 2),
(3,'LL3', 3),
(4,'LL3', 4),
(5,'LL5', 5),
(6,'LL5', 6),
(7,'LL6', 7),
(8, 'LL6', 8),
(9, 'LL3', 9),
(10,'LL3', 10),
(11,'LL5', 11),
(12,'LL5', 12),
(13, 'LL6', 13),
(14, 'LL6', 14),
(15, 'LL3', 15),
(16, 'LL3', 16),
(17, 'LL5', 17),
(18, 'LL5', 18),
(19, 'LL6', 19),
(20, 'LL6', 20)
ON CONFLICT DO NOTHING;