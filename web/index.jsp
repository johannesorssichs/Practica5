
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <link rel="stylesheet" type="text/css" href="diseño.css">
    <meta charset="UTF-8">
    <title>CALCULADORA</title>
  </head>
  <body>
    <div class="MiPanel">
      <form action="ServletPractica5" method="POST">
        CALCULADORA JOHANNES <br>

        Primer Número: <input name ="param1" type="text"><br>
        Segundo Número: <input name ="param2" type="text"><br>

        <select name="Opciones">
          <option value="Suma">Sumar</option>
          <option value="Resta">Restar</option>
          <option value="Multiplicacion">Multiplicar</option>
          <option value="Division">Dividir</option>
        </select>

        <input type="submit" value="CALCULAR">

      </form>
    </div>
  </body>
</html>