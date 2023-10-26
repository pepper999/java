let videoList = [
    {
      "id": "gMaB-fG4u4g",
      "title": "전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]",
      "part": "전신",
      "channelName": "ThankyouBUBU",
      "url": "https://www.youtube.com/embed/gMaB-fG4u4g"
    },
    {
      "id": "swRNeYw1JkY",
      "title": "하루 15분! 전신 칼로리 불태우는 다이어트 운동",
      "part": "전신",
      "channelName": "ThankyouBUBU",
      "url": "https://www.youtube.com/embed/swRNeYw1JkY"
    },
    {
      "id": "54tTYO-vU2E",
      "title": "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]",
      "part": "상체",
      "channelName": "ThankyouBUBU",
      "url": "https://www.youtube.com/embed/54tTYO-vU2E"
    },
    {
      "id": "QqqZH3j_vH0",
      "title": "상체비만 다이어트 최고의 운동 [상체 핵매운맛]",
      "part": "상체",
      "channelName": "ThankyouBUBU",
      "url": "https://www.youtube.com/embed/QqqZH3j_vH0"
    },
    {
      "id": "tzN6ypk6Sps",
      "title": "하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]",
      "part": "하체",
      "channelName": "김강민",
      "url": "https://www.youtube.com/embed/tzN6ypk6Sps"
    },
    {
      "id": "u5OgcZdNbMo",
      "title": "저는 하체 식주의자 입니다",
      "part": "하체",
      "channelName": "GYM종국",
      "url": "https://www.youtube.com/embed/u5OgcZdNbMo"
    },
    {
      "id": "PjGcOP-TQPE",
      "title": "11자복근 복부 최고의 운동 [복근 핵매운맛]",
      "part": "복부",
      "channelName": "ThankyouBUBU",
      "url": "https://www.youtube.com/embed/PjGcOP-TQPE"
    },
    {
      "id": "7TLk7pscICk",
      "title": "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)",
      "part": "복부",
      "channelName": "SomiFit",
      "url": "https://www.youtube.com/embed/7TLk7pscICk"
    }
  ]
  

let videoHtml = `<div class="carousel-item active">`;;
for (i = 0; i < videoList.length; i++) {
  if (i < 3) {
    videoHtml += `
    <iframe width="200" height="100" src="https://www.youtube.com/embed/${videoList[i].id}" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
    `
  } else {
    if (i%3 === 0) {
      videoHtml += `
      </div>
      <div class="carousel-item">
      `
    }
      videoHtml += `
      <iframe width="200" height="100" src="https://www.youtube.com/embed/${videoList[i].id}" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
      `
  }
}
videoHtml += `</div>`


if ( document.querySelectorAll(".video-area").length !== 0 ) {
  document.querySelectorAll(".video-area")[0].innerHTML = videoHtml
  document.querySelectorAll(".video-area")[1].innerHTML = videoHtml
}


let reviewHtml = `
<iframe width="200" height="100" src="https://www.youtube.com/embed/gMaB-fG4u4g" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
`
if (document.querySelector(".review-content") !== null){
document.querySelector(".review-content").innerHTML = reviewHtml
}

if (document.querySelector(".review-table-list") !== null){
document.querySelector(".review-table-list").innerHTML = `
<tr>
<td>4</td>
<td>와~ 효과만점 운동 영상입니다.</td>
<td>a</td>
<td>0</td>
<td>2022-01-05</td>
</tr>
`
}

if (document.querySelector(".review-about") !== null){
document.querySelector(".review-about").innerHTML = `
<strong> 와 효과만점 운동 영상입니다 </strong>
<div>작성자 : a</div>
<div>작성일 : 2022-01-05</div>
<div>조회수 : 1</div>
`
}

if (document.querySelector(".review-content-check") !== null){
document.querySelector(".review-content-check").innerHTML = `
강추강추!
`
}