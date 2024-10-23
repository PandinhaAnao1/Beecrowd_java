SELECT pd.id, pd.name FROM products 
AS pd JOIN categories AS ct ON pd.id_categories = ct.id
WHERE ct.name LIKE 'super%';

-- Nova descoberta, no Postegree sql não deve ser usado ("") aspas duplas
-- pois elas identificam colunas e não são validas em coisas como like