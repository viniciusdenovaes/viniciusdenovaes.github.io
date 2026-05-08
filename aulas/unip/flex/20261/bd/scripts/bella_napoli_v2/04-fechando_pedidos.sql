-- Fechando Pedidos do Bruno (ID 2)
UPDATE Pedidos
SET status_pedido = 'Finalizado',
    data_entrega = GETDATE()
WHERE id_cliente = 2;

GO
