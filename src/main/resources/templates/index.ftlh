<html>
<head>
  <title>Tools</title>
</head>
<br>


<#list workers as name, fields>
<p>=====================================</p>
<h1 style="color:blue;"> ${name}: </h1>
  <form action="/calculate?worker=${name}" method="post">
    <#list fields as field>
    <label for="${field.getName()}">${field.getName()}</label>
      <input type="${field.getType()}" name="${field.getName()}" /></br>
    </#list> </br>
    <input type="submit" value="Submit" />
  </form>
<p>=====================================</p>
</#list>


</body>
</html>