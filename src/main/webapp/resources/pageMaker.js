/**
 * Created by hyojun on 15. 12. 4.
 */

function makePage(criteria) {
	var startPage, endPage, prev, next;
	var str = "";

	var pageNo = criteria.pageNo;
	endPage = Math.ceil(pageNo / 10.0) * 10;
	startPage = endPage - 9;

	var tempLast = Math.ceil(criteria.totalCount / criteria.perPage);
	console.log(startPage, endPage, tempLast);

	endPage = tempLast < endPage ? tempLast : endPage;

	prev = startPage == 1 ? false : true;
	next = tempLast > endPage ? true : false;
	console.log(endPage);

	if (prev) {
		str += "<li><a href=" + "'/board/list?pageNo=" + (startPage - 1) + "'> << </a></li>";
	}
	for (var i = startPage; i <= endPage; i++) {
		str += "<li><a href= " + "'/board/list?pageNo="+ i +"' > " + i + " </a></li>";
	}
	if (next) {
		str += "<li><a href=" + "'/board/list?pageNo=" + (endPage + 1) + "'> >> </a></li>";
	}
	return str;

}

var cri = {
	pageNo : 12,
	totalCount : 151,
	perPage : 10,
	searchType : 'w'
};
console.log(makePage(cri));
