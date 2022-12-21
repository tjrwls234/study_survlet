<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/commons.css" />
  </head>
  <body>
    <%! int day = 3; %>
    <form action="">
      <div class="container">
        <div class="fs-3">Search Form</div>
        <div>
          <label for="" class="form-label">Search with Name</label>
          <input
            type="email"
            name=""
            id=""
            class="form-control"
            placeholder="Input Name"
          />
        </div>
        <% if (day ==1 || day ==7) {%>
        <div>Today is Weekend ! <%= day %></div>
        <% } else { %>
        <div>Today is Now Weekend ! <%= day %></div>
        <% } %>
      </div>
    </form>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
