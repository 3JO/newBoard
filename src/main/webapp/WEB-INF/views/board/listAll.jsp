<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->

			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">LIST ALL PAGE</h3>
				</div>
				<div class="box-body">

					<table class="table table-bordered">
						<tr>
							<th style="width: 10px">BNO</th>
							<th>TITLE</th>
							<th>WRITER</th>
							<th>REGDATE</th>
							<th style="width: 40px">VIEWCNT</th>
						</tr>


						<c:forEach items="${list}" var="boardVO">

							<tr>
								<td>${boardVO.bno}</td>
								<td><a href='/board/read?bno=${boardVO.bno}'>${boardVO.title}</a></td>
								<td>${boardVO.writer}</td>
								<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
										value="${boardVO.regdate}" /></td>
								<td><span class="badge bg-red">${boardVO.viewcnt }</span></td>
							</tr>

						</c:forEach>

					</table>
					<select id="searchType">
						<option value="n"
							<c:out value="${cri.searchType == null?'selected':''}"/>>
							Choice</option>
						<option value="t"
							<c:out value="${cri.searchType eq 't'?'selected':''}"/>>
							Title</option>
						<option value="c"
							<c:out value="${cri.searchType eq 'c'?'selected':''}"/>>
							Content</option>
						<option value="w"
							<c:out value="${cri.searchType eq 'w'?'selected':''}"/>>
							Writer</option>
						<option value="tc"
							<c:out value="${cri.searchType eq 'tc'?'selected':''}"/>>
							Title OR Content</option>
						<option value="cw"
							<c:out value="${cri.searchType eq 'cw'?'selected':''}"/>>
							Content OR Writer</option>
						<option value="tcw"
							<c:out value="${cri.searchType eq 'tcw'?'selected':''}"/>>
							Title OR Content OR Writer</option>
					</select> <input type="text" name='keyword' id="keywordInput"
						value='${cri.keyword }'>
					<button id='searchBtn'>Search</button>

					<ul class="pagination" id="pageUL"></ul>

				</div>
				<!-- /.box-body -->
				<script src="/resources/pageMaker.js"></script>
				<script>
					$(document)
							.ready(
									function() {
										var cri = {
											pageNo : 12,
											totalCount : 151,
											perPage : 10,
											searchType : 'w',
											keyword : "홍길동"
										};

										$("#pageUL").html(makePage(cri));

										$("#pageUL").on(
												"click",
												"li a",
												function(event) {
													event.preventDefault();
													var targetPage = $(this)
															.attr("href");
													console.log(targetPage);
												});

										var options = $("#searchType option");
										console.log("options size : "
												+ options.size());

										console
												.log($("#searchType option[value="
														+ cri.searchType + "]"));

										$(
												"#searchType option[value="
														+ cri.searchType + "]")
												.attr("selected", "true");

										$("#keyword").val(cri.keyword);
									});
				</script>

				<div class="box-footer">
					<a href="/board/register?bno=1">
						<button type="submit" class="btn btn-primary">Regist</button>
					</a>
				</div>
				<script>
					$(document).ready(function() {

						var formObj = $("form[role='form']");
						console.log(formObj);
						$(".btn-primary").on("click", function() {
							formObj.submit();
						});

					});
				</script>
				<!-- /.box-footer-->

			</div>
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<script>
	var result = '${msg}';

	if (result == 'SUCCESS') {
		alert("처리가 완료되었습니다.");
	}
</script>

<%@include file="../include/footer.jsp"%>