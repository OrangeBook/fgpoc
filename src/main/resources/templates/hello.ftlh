<html>
<head>
  <title>Tools</title>
</head>
<br>


<#list workers as name, fields>
<p>Worker ${name}: </p>
  <form action="/calculate" method="post">
    <#list fields as field>
      <input type="${field.getType()}" name="${field.getName()}" value="Type here"/></br>
    </#list> </br>
    <input type="submit" value="Submit" />
  </form>
</#list>


</body>
</html>