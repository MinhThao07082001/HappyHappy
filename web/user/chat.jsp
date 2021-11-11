<%-- 
    Document   : chat
    Created on : Oct 5, 2021, 1:24:02 AM
    Author     : Admin
--%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"
      dir="ltr">
 
 
    <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-instructor-messages-2.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:15:16 GMT -->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible"
              content="IE=edge">
        <meta name="viewport"
              content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Messenger</title>
 
        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->
        <meta name="robots"
              content="noindex">
 
        <!-- Custom Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap"
              rel="stylesheet">
 
        <!-- Perfect Scrollbar -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/vendor/perfect-scrollbar.css"
              rel="stylesheet">
 
        <!-- Material Design Icons -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/css/material-icons.css"
              rel="stylesheet">
 
        <!-- Font Awesome Icons -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/css/fontawesome.css"
              rel="stylesheet">
 
        <!-- Preloader -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/vendor/spinkit.css"
              rel="stylesheet">
 
        <!-- App CSS -->
        <link type="text/css"
              href="${pageContext.request.contextPath}/user/assets/css/app.css"
              rel="stylesheet">
 
    </head>
 
    <body class="app-messages fixed-layout">
 
        <div class="preloader">
            <div class="sk-chase">
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
                <div class="sk-chase-dot"></div>
            </div>
 
            
        </div>
        <h1>${requestScope.conversationID} UOA</h1>
        <!-- Header Layout -->
        <div class="mdk-header-layout js-mdk-header-layout">
             
            <!-- Header -->
            <c:if test="${requestScope.role eq 1}">
                <jsp:include page="mentor/mentor_header.jsp"></jsp:include>
            </c:if>
            <c:if test="${requestScope.role eq 2}">
                <jsp:include page="mentee/mentee_header.jsp"></jsp:include>
            </c:if>
 
            <!-- // END Header -->
 
            <!-- Header Layout Content -->
            <div class="mdk-header-layout__content d-flex flex-column">
 
                <div class="page " style="margin-top: -64px">
 
                    <div class="app-messages__container d-flex flex-column h-100 pb-4">
                        <div class="navbar navbar-light bg-white navbar-expand-sm navbar-shadow z-1">
                            <div class="container flex-wrap px-sm-0">
                                <div class="nav py-2">
                                    <div class="nav-item align-items-center mr-3">
                                        <div class="mr-3">
                                            <div class="avatar avatar-online avatar-sm">
                                                <img src="${user2.imgAvt}"
                                                     alt="people"
                                                     class="avatar-img rounded-circle">
                                            </div>
                                        </div>
                                        <div class="d-flex flex-column"
                                             style="max-width: 200px; font-size: 15px">
                                            <strong class="text-body">${user2.name}</strong>
                                            <!--<span class="text-muted text-ellipsis">Personal Development Teacher since 2014</span>-->
                                        </div>
                                    </div>
                                </div>
                                <div class="py-2 flex d-flex align-items-center">
                                    <button data-target="#messages-drawer"
                                            class="navbar-toggler d-block ml-3 p-0"
                                            data-toggle="sidebar"
                                            type="button">
                                        <i class="material-icons">people_outline</i>
                                    </button>
                                </div>
                            </div>
                        </div>
                        <div class="flex pt-4"
                             style="position: relative;"
                             data-perfect-scrollbar>
                            <div class="container page__container">
 
                                <ul class="d-flex flex-column list-unstyled"
                                    id="messages">
 
                                    <c:forEach var="mess" items="${requestScope.mList}">
                                        <li class="message d-inline-flex">
                                            <div class="message__aside">
                                                <a href="fixed-instructor-profile.html"
                                                   class="avatar">
                                                    <img src="${mess.sender eq requestScope.user1.userID ? requestScope.user1.imgAvt : requestScope.user2.imgAvt}"
                                                         alt="people"
                                                         class="avatar-img rounded-circle">
                                                </a>
                                            </div>
                                            <div class="message__body card">
                                                <div class="card-body">
                                                    <div class="d-flex align-items-center">
                                                        <div class="flex mr-3">
                                                            <a href="#0"
                                                               class="text-body"><strong>${mess.sender eq requestScope.user1.userID ? requestScope.user1.name : requestScope.user2.name}</strong></a>
                                                        </div>
                                                        <div>
                                                            <small class="text-muted">just now</small>
                                                        </div>
                                                    </div>
                                                    <span class="text-black-70">${mess.content}</span>
 
                                                </div>
                                            </div>
                                        </li>
                                    </c:forEach>
 
 
                                </ul>
                            </div>
                        </div>
                        <div class="container page__container">
                            <form onsubmit="return sendMsg();">
                                <div class="input-group input-group-merge">
                                    <input type="text"
                                           class="form-control form-control-appended"
                                           autofocus=""
                                           required=""
                                           name="msg" id="msg"
                                           placeholder="Type message">
                                    <div class="input-group-append">
                                        <div class="input-group-text pr-2">
                                            <!--                                            <button class="btn btn-flush"
 
                                                                                                type="button"><i class="material-icons">tag_faces</i></button>-->
                                            <input type="Submit" value="Send">
                                        </div>
                                        <!--                                        <div class="input-group-text pl-0">
                                                                                    <div class="custom-file custom-file-naked d-flex"
                                                                                         style="width: 24px; overflow: hidden;">
                                                                                        <input type="file"
                                                                                               class="custom-file-input"
                                                                                               id="customFile">
                                                                                        <label class="custom-file-label"
                                                                                               style="color: inherit;"
                                                                                               for="customFile">
                                                                                            <i class="material-icons">attach_file</i>
                                                                                        </label>
                                                                                    </div>
                                                                                </div>-->
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
 
                    <div class="container page__container">
                        <div class="footer">
                            Copyright &copy; 2016 - <a href="http://themeforest.net/item/learnplus-learning-management-application/15287372?ref=mosaicpro">Purchase LearnPlus</a>
                        </div>
                    </div>
                                              <%@include file="/user/mentee/mentee_tab.jsp" %>
                </div>
            </div>
            <!-- // END Header Layout Content -->
 
        </div>
        <!-- // END Header Layout -->
 
        <div class="mdk-drawer js-mdk-drawer"
             data-align="end"
             id="messages-drawer">
            <div class="mdk-drawer__content ">
                <div class="sidebar sidebar-right sidebar-light bg-white o-hidden">
                    <div class="d-flex flex-column h-100">
                        <div class="d-flex flex-column justify-content-center navbar-height">
                            <div class="px-3 form-group mb-0">
                                <div class="input-group input-group-merge input-group-rounded flex-nowrap">
                                    <input type="text"
                                           class="form-control form-control-prepended"
                                           placeholder="Filter members">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">
                                            <span class="material-icons">filter_list</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
 
                        <div class="flex"
                             data-perfect-scrollbar>
                            <div class="sidebar-heading">Conversation</div>
                            <ul class="list-group list-group-fit mb-3">
                                <c:forEach var="conv" items="${requestScope.convList}">
                                    <li class="list-group-item px-4 py-3 bg-light">
                                        <a href="conversation?id=${conv.userID}" class="d-flex align-items-center position-relative">
                                            <span class="avatar avatar-sm avatar-online mr-3 flex-shrink-0">
 
                                                <img src="${conv.imgAvt}" alt="Avatar" class="avatar-img rounded-circle">
 
                                            </span>
                                            <span class="flex d-flex flex-column" style="max-width: 175px;">
                                                <strong class="text-body">${conv.name}</strong>
 
                                                <span class="text-muted text-ellipsis">Personal Development Teacher Since 2014</span>
 
                                            </span>
                                        </a>
                                    </li>
                                </c:forEach>
 
 
                            </ul>
 
                        </div>
                    </div>
                </div>
            </div>
        </div>
 
        
 
        <!-- App Settings FAB -->
        <!--        <div id="app-settings">
                    <app-settings layout-active="fixed"
                                  :layout-location="{
                                  'fixed': 'fixed-instructor-messages-2.html',
                                  'default': 'instructor-messages-2.html'
                                  }"
                                  sidebar-variant="bg-transparent border-0"></app-settings>
                </div>-->
        <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/jquery.min.js"></script>
 
        <!-- Bootstrap -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/popper.min.js"></script>
        <script src="${pageContext.request.contextPath}/user/assets/vendor/bootstrap.min.js"></script>
 
        <!-- Perfect Scrollbar -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/perfect-scrollbar.min.js"></script>
 
        <!-- MDK -->
        <script src="${pageContext.request.contextPath}/user/assets/vendor/dom-factory.js"></script>
        <script src="${pageContext.request.contextPath}/user/assets/vendor/material-design-kit.js"></script>
 
        <!-- App JS -->
        <script src="${pageContext.request.contextPath}/user/assets/js/app.js"></script>
 
        <!-- Highlight.js -->
        <script src="${pageContext.request.contextPath}/user/assets/js/hljs.js"></script>
 
        <!-- App Settings (safe to remove) -->
        <script src="${pageContext.request.contextPath}/user/assets/js/app-settings.js"></script>
 
        <script id="template-message"
                type="text/x-jsrender">
            <li class="message d-inline-flex">
            <div class="message__aside">
            <a href="fixed-instructor-profile.html" class="avatar">
            <img src="{{:avatar}}" alt="people" class="avatar-img rounded-circle">
            </a>
            </div>
            <div class="message__body card">
            <div class="card-body">
            <div class="d-flex align-items-center">
            <div class="flex mr-3">
            <a href="fixed-instructor-profile.html" class="text-body"><strong>{{:name}}</strong></a>
            </div>
            <div>
            <small class="text-muted">{{:date}}</small>
            </div>
            </div>
            <span class="text-black-70">{{:message}}</span>
            {{if file}}
            <a href="#" class="media align-items-center mt-2 text-decoration-0 bg-white px-3">
            <span class="avatar mr-2">
            <span class="avatar-title rounded-circle">
            <i class="material-icons font-size-24pt">attach_file</i>
            </span>
            </span>
            <span class="media-body" style="line-height: 1.5">
            <span class="text-primary">{{:file.name}}</span><br>
            <span class="text-muted">{{:file.size}}</span>
            </span>
            </a>
            {{/if}}
            </div>
            </div>
            </li>
        </script>
 
        <!-- Messages App -->
        <script src="${pageContext.request.contextPath}/user/assets/js/messages.js"></script>
        <script type="text/javascript">
 
                                var wsUrl;
                                //test giao thuc => ws phu hop
                                if (window.location.protocol === 'http:') {
                                    wsUrl = 'ws://';
                                } else {
                                    wsUrl = 'wss://';
                                }
                                // endpoint
                                var ws = new WebSocket(wsUrl + window.location.host + "/HappyHappy/chat/<%=request.getAttribute("conversationID")%>");
                                ws.onmessage = function (event) {
                                    var mySpan = document.getElementById("messages");
                                    mySpan.innerHTML += event.data + "<br/>";
                                };
                                ws.onopen = function (event) {
                                    console.log("WebSocket is open now.");
                                }
                                ws.onerror = function (event) {
                                    console.log("Error ", event)
                                }
                                function sendMsg() {
//        const msg = {name:<%= request.getSession().getAttribute("name")%>, content:document.getElementById("msg").value, to: <%= request.getParameter("to")%>};
//        const msgJson = JSON.stringify(msg);
                                    let text = {"from":<%=request.getAttribute("from")%>, "msg": document.getElementById("msg").value, "to":<%= request.getAttribute("to")%>, "convID":<%= request.getAttribute("conversationID")%>};
                                    const msgJson = JSON.stringify(text);
                                    if (msgJson)
                                    {
                                        ws.send(msgJson);
                                    }
                                    document.getElementById("msg").value = "";
                                    //khong reload
                                    return false
                                }
        </script>
    </body>
 
 
    <!-- Mirrored from learnplus.demo.frontendmatter.com/fixed-instructor-messages-2.html by HTTrack Website Copier/3.x [XR&CO'2014], Tue, 21 Sep 2021 16:15:16 GMT -->
</html>