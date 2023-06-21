<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <div class="py-2 text-center">
        <h3>상품 등록4224225 </h3>
    </div>

    <!-- 상품 상세 내용-->
    <div class="text-center">
        <h5>상품 입력</h5>
        <form method="post">
            <div>
                <label form="itemName">상품명</label>
                <input type="text" id="itemName" name="itemName" placeholder="이름을 입력하세요">
            </div>
            <div>
                <label form="price">가격</label>
                <input type="text" id="price" name="price" placeholder="가격을 입력하세요">
            </div>
            <div>
                <label form="quantity">수량</label>
                <input type="text" id="quantity" name="quantity" placeholder="수량을 입력하세요">
            </div>

            <hr>
            <div class="row">
                <div class="col text-center">
                    <button class="w-50 btn btn-primary btn-lg"
                            th:onclick="|location.href='@{/basic/items/add)}'|"
                            type="submit">상품 등록</button>
                </div>
                <div class="col text-center">
                    <button class="w-50 btn btn-secondary btn-lg"
                            th:onclick="|location.href='@{/basic/items}'|"
                            type="button">취소</button>
                </div>
            </div>
        </form>
    </div>
</div> <!--/container -->
</body>
</html>