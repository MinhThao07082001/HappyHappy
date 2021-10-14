<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en" dir="ltr">


    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Confirm Email</title>

        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
        <meta name="robots" content="noindex">

        <!-- Custom Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap" rel="stylesheet">

        <!-- Perfect Scrollbar -->
        <link type="text/css" href="user/assets/vendor/perfect-scrollbar.css" rel="stylesheet">

        <!-- Material Design Icons -->
        <link type="text/css" href="user/assets/css/material-icons.css" rel="stylesheet">

        <!-- Font Awesome Icons -->
        <link type="text/css" href="user/assets/css/fontawesome.css" rel="stylesheet">

        <!-- Preloader -->
        <link type="text/css" href="user/assets/vendor/spinkit.css" rel="stylesheet">

        <!-- App CSS -->
        <link type="text/css" href="user/assets/css/app.css" rel="stylesheet">
        <style>
/*            .next {
                padding-left: 46%;
                padding-right: 46%;
                padding-top: 9px;
                padding-bottom: 9px;
                background-color: #2295F5;
                border: #2295F5;
                color: #FFFFFF;
            }

            .next:hover {
                background-color: #0C83E2;
                color: #FFFFFF;
            }
*/
            .form-group .next {
                margin-top: 15px;
                border-radius: 4px;
            }
            /*        Style Password*/
            input {
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
                margin-top: 6px;
                margin-bottom: 16px;
            }

            /* Style the container for inputs */
            /* The message box is shown when the user clicks on the password field */
            #message {
                display:none;
                color: #000;
                position: relative;
                padding: 20px;
                margin-top: 10px;
            }

            #message h8 {
                padding: 10px 35px;
                font-size: 14px;
            }

            /* Add a green text color and a checkmark when the requirements are right */
            .valid {
                color: green;
            }

            .valid:before {
                position: relative;
                left: -35px;
                content: "✔";
            }

            /* Add a red text color and an "x" when the requirements are wrong */
            .invalid {
                color: red;
            }

            .invalid:before {
                position: relative;
                left: -35px;
                content: "✖";

            }
            body{
                background-image: url('user/assets/images/background.jpg') ;

            }
            .logo{
                width: 100%;
                height: 100%;
            }

        </style>
    </head>

    <body class="login">
        <div class="d-flex align-items-center" style="min-height: 100vh">
            <div class="col-sm-8 col-md-6 col-lg-4 mx-auto" style="min-width: 300px;">


                <%
                    if (request.getAttribute("mess") != null) {
                %>
                <p style="color: yellow; background: red;margin: 0;font-size: x-large;" align="center" ><%= request.getAttribute("mess")%></p>
                <%
                    }
                %>
                <div class="card navbar-shadow" style="border-radius: 20px;">
                    <div class="text-center mt-5 mb-1">
                        <div class="avatar avatar-lg">
                            <img class="logo" src="user/assets/images/logo/logo.svg" class="avatar-img rounded-circle" alt="LearnPlus" />
                        </div>
                    </div>
                    <div class="card-header text-center">
                        <h4 class="card-title">Confirm Email</h4>
                        <p class="card-subtitle">Check your email for verification code</p>
                    </div>
                    <div class="card-body">
                        <form action="confirm" method="post">
                            <!-- page 1 -->
                            <div id="test1">
                                <div class="sign ">
                                    <div class="form-group">
                                        <label class="form-label" for="email">Your Email: <span style="color:red">*</span></label>
                                        <div class="input-group input-group-merge">
                                            <input id="email" type="email" name="email"
                                                   required="" class="form-control form-control-prepended" placeholder="Enter Your Email">
                                            <div class="input-group-prepend">
                                                <div class="input-group-text">
                                                    <span class="far fa-envelope"></span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                             <div style="text-align: center;">
                                <input style=" border-radius: 10px; background-color: #94B85E; color:#FFFFFF; width: 30%;" class="next" type="submit" value="Confirm">
                            </div>
                        </form>                  
                    </div>

                </div>
            </div>
        </div>
        <!-- SignUp Password Check-->
        <script>
            var myInput = document.getElementById("password");
            var letter = document.getElementById("letter");
            var capital = document.getElementById("capital");
            var number = document.getElementById("number");
            var length = document.getElementById("length");

            // When the user clicks on the password field, show the message box
            myInput.onfocus = function () {
                document.getElementById("message").style.display = "block";
            }

            // When the user clicks outside of the password field, hide the message box
            myInput.onblur = function () {
                document.getElementById("message").style.display = "none";
            }

            // When the user starts to type something inside the password field
            myInput.onkeyup = function () {
                // Validate lowercase letters
                var lowerCaseLetters = /[a-z]/g;
                if (myInput.value.match(lowerCaseLetters)) {
                    letter.classList.remove("invalid");
                    letter.classList.add("valid");
                } else {
                    letter.classList.remove("valid");
                    letter.classList.add("invalid");
                }

                // Validate capital letters
                var upperCaseLetters = /[A-Z]/g;
                if (myInput.value.match(upperCaseLetters)) {
                    capital.classList.remove("invalid");
                    capital.classList.add("valid");
                } else {
                    capital.classList.remove("valid");
                    capital.classList.add("invalid");
                }

                // Validate numbers
                var numbers = /[0-9]/g;
                if (myInput.value.match(numbers)) {
                    number.classList.remove("invalid");
                    number.classList.add("valid");
                } else {
                    number.classList.remove("valid");
                    number.classList.add("invalid");
                }

                // Validate length
                if (myInput.value.length >= 8) {
                    length.classList.remove("invalid");
                    length.classList.add("valid");
                } else {
                    length.classList.remove("valid");
                    length.classList.add("invalid");
                }
            }
        </script>
        <!-- jQuery -->
        <script src="user/assets/vendor/jquery.min.js "></script>

        <!-- Bootstrap -->
        <script src="user/assets/vendor/popper.min.js "></script>
        <script src="user/assets/vendor/bootstrap.min.js "></script>

        <!-- Perfect Scrollbar -->
        <script src="user/assets/vendor/perfect-scrollbar.min.js "></script>

        <!-- MDK -->
        <script src="user/assets/vendor/dom-factory.js "></script>
        <script src="user/assets/vendor/material-design-kit.js "></script>

        <!-- App JS -->
        <script src="user/assets/js/app.js "></script>

        <!-- Highlight.js -->
        <script src="user/assets/js/hljs.js "></script>

        <!-- App Settings (safe to remove) -->
        <script src="user/assets/js/app-settings.js "></script>

        <script type="text/javascript" src="user/js/yourCode.js"></script>
        <script src="user/script.js"></script>
    </body>


    <!-- Mirrored from learnplus.demo.frontendmatter.com/guest-signup.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:13:48 GMT -->

</html>