# UD22-Patr-nMVC-2

## MVC - Model View Controller

Al iniciar el programa la primera vista que aparece es la "VistaConexion" para establecer la conexión al servidor mysql.

![captura_ventana_conexion](https://user-images.githubusercontent.com/67373492/168750664-3a02cec0-de15-4100-bc0c-200a03aebdca.PNG)

Tras realizar la conexión, se crea una base de datos llamada "VideoClub" con la tabla "clientes", la tabla "videos" y se insertan varios registros en cada tabla.

La siguiente vista que aparece es la "VistaPrincipal" en la que podremos ver todos los registros de cada tabla. Esta vista tiene una barra de menú en la que podremos escoger la opción de añadir un nuevo registro en las tablas o buscar un registro.

![captura_ventana_principal](https://user-images.githubusercontent.com/67373492/168752406-8facafcf-9661-4a23-b265-30ff88f0b13a.PNG)
![captura_menu](https://user-images.githubusercontent.com/67373492/168752701-11e58a16-aa06-48ef-9ec9-4e91d3f800e7.png)
![captura_menu_buscar](https://user-images.githubusercontent.com/67373492/168752706-95b791bb-dce3-4133-b424-90d75bd61104.png)

Si se quiere insertar un nuevo registro nos aparecerá la vista "VistaC_cli" y "VistaC_vid".

![ventana_insertar_registro_cliente](https://user-images.githubusercontent.com/67373492/168752847-015f1c42-1d26-4978-b1cf-3a84c1cfde52.png)
![ventana_insertar_registro_video](https://user-images.githubusercontent.com/67373492/168752863-25ebc698-d1d3-4a42-ac67-ad2d389b85fd.png)

En el caso de buscar un nuevo registro se nos abriran la vista "VistaU" o "VistaUVid". En las cuales se podrá buscar un registro por id, modificarlo o eliminarlo.

![captura_ventana_buscar_cliente](https://user-images.githubusercontent.com/67373492/168753336-8dac6341-c009-45e6-bd44-94a85a9715fa.png)
![captura_ventana_buscar_video](https://user-images.githubusercontent.com/67373492/168753342-32607d8a-af73-4912-b95f-0085e5262703.png)
