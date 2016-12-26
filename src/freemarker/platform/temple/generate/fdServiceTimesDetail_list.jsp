<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.java.com/tags/application" prefix="ap" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://www.extremecomponents.org" prefix="com.java.ec"%>
<%@ taglib tagdir="/WEB-INF/tags/styles" prefix="styles"%>
<%@ taglib tagdir="/WEB-INF/tags/dictionary" prefix="dictionary"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>测评套题-年龄</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<!-- css/js -->
		<link href="${pageContext.request.contextPath}/product/theme/winxp/resource/skin/blue/usap/css/style.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath}/product/theme/winxp/resource/skin/blue/usap/css/style2.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath}/product/theme/winxp/resource/skin/blue/usap/css/pop_button.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/environment/js/mootools/mootools-1.2-core.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/environment/js/mootools/mootools-1.2-more.js"></script>

		<!-- environment弹出窗口样式 -->
		<link href="${pageContext.request.contextPath}/environment/themes/winxp/resource/skin/blue/SimpleUI/css/SimpleUI.css" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/environment/js/environment/environment.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/environment/js/SimpleUI/SimpleUI.js"></script>

		<!-- ecTable -->
		<link href="${pageContext.request.contextPath}/product/theme/winxp/resource/skin/blue/css/ec.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/product/theme/winxp/resource/js/ectable/EcTable.js"></script>

		<!-- formcheck表单验证 -->
		<link href="${pageContext.request.contextPath}/environment/themes/winxp/resource/skin/blue/formcheck/css/formcheck.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/environment/js/formcheck/formcheck.js"></script>
		
		<!-- alert消息提示 -->
		<link href="${pageContext.request.contextPath}/product/theme/winxp/resource/js/message/ymPrompt/skin/qq/ymPrompt.css" type="text/css" rel="stylesheet" />
		<script type="text/javascript" src="${pageContext.request.contextPath}/product/theme/winxp/resource/js/message/ymPrompt/ymPrompt.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/product/theme/winxp/resource/js/message/ymPrompt/showMsg.js"></script>

		<!-- util 工具 js -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/product/theme/winxp/resource/js/wdate/WdatePicker.js"></script>	
		
	</head>

	<body>
	<s:actionmessage theme="popwind"/>
  		<div id="wz">
			<ap:step></ap:step>
			<div class="wz_right">
				<div class="but01">
					<div class="pop_button_bar">
						<span><a href="javascript:doAdd();" class="pop_button_blue">添加</a></span>
						<span><a href="javascript:doEdit();" class="pop_button_green">编辑</a></span>
					</div>
				</div>
			</div>
		</div>
		<table width="90%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="left" valign="top"><img src="${pageContext.request.contextPath}/product/theme/winxp/resource/skin/blue/usap/images/null.gif" width="50" height="5"></td>
			</tr>
		</table>
		<table width="100%" height="45"  border="0" cellpadding="1" cellspacing="1" bgcolor="#B7C6DD">
			<tr align="center" valign="middle" bgcolor="#F6F9FE">
				<td height="43" align="center" class="text3">
					<s:form action="/fdServiceTimesDetail/fdServiceTimesDetail.action" name="query_list_form" id="query_list_form" theme="simple">
						<table width="98%"  border="0" cellpadding="0" cellspacing="0" class="text3">
							<tr>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.id：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.id"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.id}"/>		
								</td>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.fdServiceTimes：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.fdServiceTimes"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.fdServiceTimes}"/>		
								</td>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.timeDetailName：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.timeDetailName"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.timeDetailName}"/>		
								</td>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.effectiveTime：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.effectiveTime"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.effectiveTime}"/>		
								</td>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.servicePrice：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.servicePrice"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.servicePrice}"/>		
								</td>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.remark：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.remark"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.remark}"/>		
								</td>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.isEnable：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.isEnable"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.isEnable}"/>		
								</td>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.effectiveTimeShow：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.effectiveTimeShow"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.effectiveTimeShow}"/>		
								</td>
								<td width="8%" height="41" align="right">fdServiceTimesDetail.sort：</td>
								<td width="12%" align="left">
									<input name="fdServiceTimesDetail.sort"  type="text" 
									class="validate['length[200]'] text3"  value="${fdServiceTimesDetail.sort}"/>		
								</td>
								<td width="19%" align="left">
									<input name="action"  type="hidden" class="input1" value="queryFdServiceTimesDetailByPage"/>
									<a href="javascript:document.getElementById('query_list_form').submit();"><img src="${pageContext.request.contextPath}/product/theme/winxp/resource/skin/blue/usap/images/serch21.gif" width="65" height="23" border="0"></a>
								</td>
							</tr>
						</table>
					</s:form>
				</td>
			</tr>
		</table>
		
		<table width="100%" border="0" cellpadding="1" cellspacing="1" bgcolor="#B7C6DD">
			<tr>
				<td>
					<div class="eXtremeTable">
						<s:if test="#request.list.size>0">
							<com.java.ec:table items="list" var="p" tableId="list" border="0"
								action="${pageContext.request.contextPath}/fdServiceTimesDetail/fdServiceTimesDetail.action"
								imagePath="${pageContext.request.contextPath}/product/theme/winxp/resource/js/ectable/images/table/*.gif"
								width="100%" retrieveRowsCallback="limit" sortRowsCallback="limit"
								filterable="false" autoIncludeParameters="true" sortable="false">
								<com.java.ec:row >
									<com.java.ec:column property="id" alias="id_radio" cell="radio" title="选择"  width="5%" />
									<com.java.ec:column property="id" title="id" width="10%"/>
									<com.java.ec:column property="fdServiceTimes" title="fdServiceTimes" width="10%"/>
									<com.java.ec:column property="timeDetailName" title="timeDetailName" width="10%"/>
									<com.java.ec:column property="effectiveTime" title="effectiveTime" width="10%"/>
									<com.java.ec:column property="servicePrice" title="servicePrice" width="10%"/>
									<com.java.ec:column property="remark" title="remark" width="10%"/>
									<com.java.ec:column property="isEnable" title="isEnable" width="10%"/>
									<com.java.ec:column property="effectiveTimeShow" title="effectiveTimeShow" width="10%"/>
									<com.java.ec:column property="sort" title="sort" width="10%"/>
								</com.java.ec:row>
							</com.java.ec:table>
						</s:if>
						<s:else>
							<styles:nolist/>
						</s:else>
					</div>
				</td>
			</tr>
		</table>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.6.2.js"></script>
		<script type="text/javascript">
			$j = jQuery.noConflict();
			// 新增信息 
			function doAdd(action) {
				action="${pageContext.request.contextPath}/fdServiceTimesDetail/fdServiceTimesDetail.action?action=toAddOrUpdatePage";
				window.location.href=action;
			}
			// 编辑信息 
			function doEdit(action) {
				action="${pageContext.request.contextPath}/fdServiceTimesDetail/fdServiceTimesDetail.action?action=toAddOrUpdatePage";
				var $checked = $j("input:checked");
				if(0==$checked.length){
					showMsg("请选择一项待修改的记录！");
					return;
				}
				window.location.href=action + "&fdServiceTimesDetail.id="+$checked.val();
			}
		</script>
  	</body>
</html>
