<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../vehiculo/com.vehiculoMV/style.css"> 
        <title>Registro de Vehiculo</title>
    </head>
    <body>
        <form method="post" autocomplete="off">
        <h2>Bienvenido Registro de Vehiculo</h2>
            <div class="input-group">
            <div class="input-container">
            <input type="text" name="placa" placeholder="placa">
            </div>
            <div class="input-container">
            <input type="text" name="modelo" placeholder="modelo">
            </div>
            <div class="input-container">
            <input type="text" name="color" placeholder="color">
            </div>
             <div class="input-container">
            <input type="text" name="puertas" placeholder="puertas">
            </div>
            <div class="input-container">
            <input type="text" name="cilindro" placeholder="cilindro">
            </div>
            <div class="input-container">
            <input type="text" name="tipocombustible" placeholder="tipocombustible">
            </div>
            <div class="form-group">
            <input type="submit" name="guardar" class="btn" value="Guardar">
            </div>
                
        </form>
        <?php
        // put your code here
        include("../vehiculo/com.vehiculoDAO/guardar.php");
        ?>
        
        <h2>Registros existentes:</h2>
         <table >
            <tr>
                <th>Codigo</th>
                <th>Nombre</th>
                <th>Estatus</th>
            </tr>
            <?php
        include ("../vehiculo/com.vehiculoDAO/lista.php");
        ?>
        </table>     
    </body>
</html>
