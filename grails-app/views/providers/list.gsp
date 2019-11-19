<%@ page import="bricksmanagementclient.Provider"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName"
           value="${message(code: 'provider.label', default: 'Provider')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<a href="#list-provider" class="skip" tabindex="-1"><g:message
        code="default.link.skip.label" default="Skip to content&hellip;" /></a>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message
                code="default.home.label" /></a></li>
        <li><g:link class="create" action="create">
            <g:message code="default.new.label" args="[entityName]" />
        </g:link></li>
    </ul>
</div>
<div id="list-provider" class="content scaffold-list" role="main">
    <h1>
        <g:message code="default.list.label" args="[entityName]" />
    </h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">
            ${flash.message}
        </div>
    </g:if>
    <table>
        <thead>
        <tr>

            <g:sortableColumn property="businessName"
                              title="${message(code: 'provider.businessName.label', default: 'Business Name')}" />
            <g:sortableColumn property="number"
                              title="${message(code: 'provider.number.label', default: 'Number')}" />
            <g:sortableColumn property="address"
                              title="${message(code: 'provider.address.label', default: 'Address')}" />
            <g:sortableColumn property="ruc"
                              title="${message(code: 'provider.ruc.label', default: 'Ruc')}" />
        </tr>
        </thead>
        <tbody>
        <g:each in="${providerInstanceList}" status="i" var="providerInstance">
            <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                <td><g:link class="edit" action="edit" id="${providerInstance?.id}">
                    ${fieldValue(bean: providerInstance, field: "businessName")}</g:link></td>

                <td>${fieldValue(bean: providerInstance, field: "number")}</td>
                <td>${fieldValue(bean: providerInstance, field: "address")}</td>
                <td>${fieldValue(bean: providerInstance, field: "ruc")}</td>
            </tr>
        </g:each>
        </tbody>
    </table>
    <div class="pagination">
        <g:paginate total="${providerInstanceTotal}" />
    </div>
</div>
</body>
</html>
