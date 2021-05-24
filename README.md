# Gestion-de-Banque-with-JEE-Spring-Boot-

Bank management carried out by Mohamed Ali Jaziri this project was carried out by Java EE "Spring Boot".  In this project you must see the folder name is Details because it have two files a presentation on this Project with the details and the second file which contains all the starting to obtain the final result. Also if you need know more details you should should see in this video and you on my YouTube channel https://www.youtube.com/watch?v=OtVsTRT5THE

# Java EE Project Spring JPA Hibernate Account Management
<h5>Introduction:</h5>
 <p>We want to create an application that allows you to manage bank accounts.</p>
 <ul>
  <li>Each account is defined with a code, a balance and a creation date.</li>
  <li>A current account is an account that also has an overdraft.</li>
  <li>A savings account is an account that also has an interest rate.</li>
  <li>Each account belongs to a client.</li>
  <li>Each client is defined by their code and name</li>
  <li>Each account can undergo several operations.</li>
  <li>There are two types of transaction: Payment and Withdrawal</li>
  <li>An operation is defined by a number, a date and an amount.</li>
</ul>
<h5>The main objectives:</h5>
<h6> 1. Functional requirements:</h6>
<p>The application must allow to:</p>
<ul>
 <li>Manage customers:</li>
 <ul>
  <li>Add a client.</li>
  <li> Consult all customers.</li>
  <li> Consult customers whose name contains a keyword.</li>
 </ul>
 <li>Manage accounts:</li>
 <ul>
  <li>Add an account.</li>
  <li>Consult an account.</li>
 </ul>
 <li>Manage operations:</li>
 <ul>
  <li>Make an amount payment into an account.</li>
  <li>Withdraw an amount from an account.</li>
  <li>Transfer money from one account to another.</li>
  <li>Consult the operations of an account page by page.</li>
 </ul>
 <li>The operations require an authentication operation.</li>
</ul>
<h6> 2. Exigences Techniques :</h6>
<p>The data is stored in a MySQL database.</p>
<p>The application consists of three layers:
<ul>
 <li>The DAO layer which is based on Spring Data, JPA, Hibernate and JDBC.</li>
 <liThe Business layer.></li>
 <li>The Business layer.</li>
 <li>The MVC-based Web layer on the Server side rn using Thymeleaf.</li>
 <li>Security is based on Spring Security.</li>
 </ul>
</p>
