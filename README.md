# HashMap
Las tablas hash son estructuras de datos excepcionalmente eficientes para representar 
conjuntos y tablas de búsqueda. En proporcionan tiempo constante, baja sobrecarga, 
inserción, borrado y búsqueda.
Las tablas hash se construyen a partir de dos ideas básicas: reducir las claves de la aplicación
aplicación a una clave hash, un número en el rango de 0 a algún N - 1, y
mapear ese número en un rango más pequeño de 0 a m - 1, m " N. Podemos
utilizar el rango pequeño para indexar en un array con acceso en tiempo constante. 
Ambas ideas son sencillas, pero la forma en que se implementan en la práctica,
afecta a la eficiencia de las tablas hash.
