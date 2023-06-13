# CasoFecha

- Toda clase hereda directa o indirectamente de la clase Object.
- Los métodos de la clase Object son comunes a todas las clases.
- De Object siempre heredamos los métodos toString y equals.
- Podemos sobreescribir estos métodos para definir el formato de impresión de los objetos de nuestras clases y el criterio de comparación respectivamente.
- Sobreescribir significa reescribir el cuerpo de un método que estamos heredando sin modificar su prototipo.
- Los objetos no pueden ser utilizados hasta tanto no hayan sido creados.
- Para crear objetos utilizamos el constructor de la clase.
- Todas las clases, al menos, un constructor.
- Podemos programar nuestro constructor o utilizar el constructor por defecto.
- Al programar explícitamente un constructor, perdemos el constructor nulo o por defecto.

- Un método está sobrecargado cuando admite más de una combinación de tipos y/o cantidades de argumentos o parametros

# FechaDetallada
Supongamos que no tenemos acceso al código de la clase Fecha. Es decir, podemos utilizarla pero no la podemos modificar por que fue hecha por terceras partes. Hagamos de cuenta que no la desarrollamos nosotros. De este modo, supongamos que, aunque la clase Fecha nos resulta útil, funciona bien y es muy práctica, queremos modificar la forma en que una fecha se representa a si misma cuando invocamos su método toString.

La solución es crear una nueva clase (FechaDetallada) que hereda de Fecha y que modifique la manera en que esta se representa como cadena. Ejemplo: 19 de noviembre de 2022