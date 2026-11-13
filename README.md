# Aplicación de Saludo (Android)

App Android desarrollada en Kotlin que recoge el nombre introducido por el usuario mediante un campo de texto y muestra un saludo personalizado en pantalla al pulsar un botón.

## Pantalla única: interfaz y saludo

- **TextView**: Muestra el título principal y el resultado del saludo.
- **EditText**: Campo de texto para introducir el nombre, configurado con restricciones de accesibilidad y ancho máximo.
- **Botón "Saludar"**: Activa la lógica de procesamiento al hacer clic.

Al pulsar "Saludar", se valida si el campo de texto está vacío. Si está vacío, se muestra un error en el campo; si es correcto, se genera un saludo personalizado utilizando el nombre introducido.

## Conceptos utilizados

- `findViewById`
- `setOnClickListener`
- Atributos de accesibilidad (`minHeight` y `maxWidth`)
- Layouts XML (`LinearLayout`)
- Control de versiones (`Git / GitHub` con `.gitignore` personalizado)

## Autor

Ángel Pino Lozano
