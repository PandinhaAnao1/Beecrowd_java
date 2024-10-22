SELECT pd.name, pv.name FROM 
products AS pd INNER JOIN providers AS pv ON pv.id = pd.id_providers
WHERE pd.id_categories = 6;