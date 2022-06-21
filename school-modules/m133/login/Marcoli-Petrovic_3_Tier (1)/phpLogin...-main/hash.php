<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- CSS only -->
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="css/hash.css">
    <title>Hash</title>
  </head>
  <body>

    <main class="form-hash">
        <form action="hash.php" method="post">      
          <div class="form-floating">
            <input type="password" class="form-control" name="password" id="floatingInput" placeholder="********">
            <label for="floatingInput">Password</label>
          </div>

          <?php
            if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['password'])) {
                echo(password_hash($_POST['password'], PASSWORD_BCRYPT));
            }
          ?>

          <div id="divider"></div>
      
          <button class="w-100 btn btn-lg btn-primary" type="submit">Hash</button>
        </form>
      </main>
    </form>
  </body>
</html>
