(this.webpackJsonpfrontend=this.webpackJsonpfrontend||[]).push([[0],{11:function(e,t,n){e.exports={container:"content_container__FNo1W",field:"content_field__3CQ-F",fieldButton:"content_fieldButton__2DW5a",searchContainer:"content_searchContainer__2tAaR",AboutUsContainer:"content_AboutUsContainer__2et_P"}},16:function(e,t,n){e.exports={container:"bottom_container__3J7WT",navigateContainer:"bottom_navigateContainer__1KJni"}},17:function(e,t,n){e.exports={productsSelection:"menuComponent_productsSelection__2m8fm",productQuantity:"menuComponent_productQuantity__2Anhq"}},27:function(e,t,n){e.exports={Container:"cartComponent_Container__OH2FC"}},32:function(e,t,n){},33:function(e,t,n){},5:function(e,t,n){e.exports={container:"Header_container__3gbBK",Logo:"Header_Logo__2ZuZy",HeaderTitles:"Header_HeaderTitles__3lMEP",HeaderTitleButton:"Header_HeaderTitleButton__3giE_",HeaderTitleMenu:"Header_HeaderTitleMenu__KcUr4",LinkBtn:"Header_LinkBtn__1TiPE"}},53:function(e,t,n){"use strict";n.r(t);var c=n(1),s=n.n(c),a=n(26),i=n.n(a),r=(n(32),n(10)),l=n(3),j=n(4),o=n(2),d=(n(33),n(5)),b=n.n(d),u=n.p+"static/media/LogoHeader.d32718fc.png",x=n(0);function O(){return Object(x.jsx)("div",{children:Object(x.jsxs)("form",{className:"formRegister",children:[Object(x.jsxs)("label",{children:["Name: ",Object(x.jsx)("input",{type:"text",name:"name"})]}),Object(x.jsxs)("label",{children:["Surname: ",Object(x.jsx)("input",{type:"text",name:"surname"})]}),Object(x.jsxs)("label",{children:["E-mail: ",Object(x.jsx)("input",{type:"email",name:"Email",placeholder:"username@provider.something"})]}),Object(x.jsxs)("label",{children:["Retype E-mail: ",Object(x.jsx)("input",{type:"text",name:"ReEmail",placeholder:"username@provider.something"})]}),Object(x.jsxs)("label",{children:["Password: ",Object(x.jsx)("input",{type:"password",name:"password"})]}),Object(x.jsxs)("label",{children:["Retype Password: ",Object(x.jsx)("input",{type:"password",name:"Repassword"})]})]})})}function h(){return Object(x.jsx)("div",{children:Object(x.jsxs)("form",{className:"formRegister",children:[Object(x.jsxs)("label",{children:["Name: ",Object(x.jsx)("input",{type:"text",name:"name"})]}),Object(x.jsxs)("label",{children:["Surname: ",Object(x.jsx)("input",{type:"text",name:"surname"})]}),Object(x.jsxs)("label",{children:["E-mail: ",Object(x.jsx)("input",{type:"email",name:"Email",placeholder:"username@provider.something"})]}),Object(x.jsxs)("label",{children:["Retype E-mail: ",Object(x.jsx)("input",{type:"text",name:"ReEmail",placeholder:"username@provider.something"})]}),Object(x.jsxs)("label",{children:["Password: ",Object(x.jsx)("input",{type:"password",name:"password"})]}),Object(x.jsxs)("label",{children:["Retype Password: ",Object(x.jsx)("input",{type:"password",name:"Repassword"})]})]})})}function p(e){var t=Object(c.useState)(!1),n=Object(l.a)(t,2),s=n[0],a=n[1],i=Object(c.useState)(!1),r=Object(l.a)(i,2),j=r[0],o=r[1];return Object(x.jsxs)("div",{className:"modal",children:[Object(x.jsx)("span",{children:Object(x.jsx)("button",{className:"modal-button",onClick:function(){a(!0),o(!1)},children:"User Registration"})}),Object(x.jsx)("span",{children:Object(x.jsx)("button",{className:"modal-button",onClick:function(){o(!0),a(!1)},children:"Owner Registration"})}),s?Object(x.jsx)(O,{}):null,j?Object(x.jsx)(h,{}):null,Object(x.jsxs)("div",{children:[Object(x.jsx)("button",{className:"modal-button",onClick:function(){e.onCancel()},children:"Cancel"}),Object(x.jsx)("button",{className:"modal-button-b",onClick:e.onConfirmRegister,children:"Register"})]})]})}var m=function(e){return Object(x.jsxs)("div",{className:"modal",children:[Object(x.jsx)("h1",{children:"Login"}),Object(x.jsxs)("form",{className:"formRegister",children:[Object(x.jsxs)("label",{children:["E-mail: ",Object(x.jsx)("input",{type:"email",name:"Email",placeholder:"username@provider.something",onChange:function(t){e.funcUser(t.target.value)}})]}),Object(x.jsxs)("label",{children:["Password: ",Object(x.jsx)("input",{type:"password",name:"password",onChange:function(t){e.funcPass(t.target.value)}})]})]}),Object(x.jsxs)("div",{children:[Object(x.jsx)("button",{className:"modal-button",onClick:function(){e.onCancel()},children:"Cancel"}),Object(x.jsx)("button",{className:"modal-button-b",onClick:e.onConfirm,children:"Enter"})]})]})};function f(e){return Object(x.jsxs)("div",{className:"modal",children:[Object(x.jsx)("h2",{children:"SHOPPING CART CONTENT"}),Object(x.jsx)("p",{children:"Total: "}),Object(x.jsx)("div",{children:Object(x.jsx)("button",{className:"modal-button",children:"Empty Cart"})}),Object(x.jsx)("h2",{children:"PAYMENT INFORMATION"}),Object(x.jsxs)("div",{children:[Object(x.jsxs)("form",{className:"formRegister",children:[Object(x.jsxs)("div",{children:["Credit ",Object(x.jsx)("input",{type:"radio"}),"Debit ",Object(x.jsx)("input",{type:"radio"})]}),Object(x.jsxs)("label",{children:["Card Owner name",Object(x.jsx)("input",{type:"text",placeholder:""})]}),Object(x.jsxs)("label",{children:["Credit Card Number",Object(x.jsx)("input",{type:"text",placeholder:""})]}),"Use profile adress ",Object(x.jsx)("input",{type:"checkbox"}),Object(x.jsxs)("label",{children:["Adress",Object(x.jsx)("input",{type:"text",placeholder:""})]})]}),Object(x.jsx)("button",{className:"modal-button",onClick:e.onClick,children:"Cancel"}),Object(x.jsx)(j.b,{to:"/orderconfirmation",children:Object(x.jsx)("button",{className:"modal-button-b",children:"Make Payment"})})]})]})}var g=function(e){var t=Object(c.useState)(!1),n=Object(l.a)(t,2),s=n[0],a=n[1];return Object(x.jsxs)("div",{className:"modalb",children:[Object(x.jsx)("h4",{children:localStorage.getItem("name")}),Object(x.jsx)("hr",{}),Object(x.jsx)("button",{onClick:e.onProfileClick,style:{border:"none"},children:Object(x.jsx)(j.b,{to:localStorage.getItem("type")+"/"+localStorage.getItem("id"),children:"My Profile"})}),Object(x.jsx)("hr",{}),Object(x.jsx)("button",{onClick:function(){a(!0)},style:{border:"none"},children:"Shopping Cart"}),Object(x.jsx)("hr",{}),Object(x.jsx)("button",{onClick:e.onLogOutClick,style:{border:"none"},children:Object(x.jsx)(j.b,{to:"/",children:"LogOut"})}),s?Object(x.jsx)(f,{onClick:function(){a(!1)}}):null]})};var v=function(e){return Object(x.jsx)("div",{className:"backdrop",onClick:e.onClick})},y=n(8),C=n.n(y);function N(e){var t=Object(c.useState)(!1),n=Object(l.a)(t,2),s=n[0],a=n[1],i=Object(c.useState)(!1),r=Object(l.a)(i,2),o=r[0],d=r[1],O=Object(c.useState)(!1),h=Object(l.a)(O,2),f=h[0],y=h[1],N=Object(c.useState)(!1),k=Object(l.a)(N,2),_=k[0],w=k[1],S=Object(c.useState)(!1),T=Object(l.a)(S,2),P=T[0],B=T[1];var L,H,R=e.managers.concat(e.consumers);function E(){d(!1),a(!1),B(!1)}return console.log("Ignore "+f),Object(x.jsxs)("div",{className:b.a.container,children:[Object(x.jsx)("div",{className:b.a.containerA,children:Object(x.jsx)(j.b,{to:"/",children:Object(x.jsx)("img",{className:b.a.Logo,src:u,alt:u})})}),Object(x.jsxs)("div",{children:[Object(x.jsx)("span",{className:b.a.HeaderTitles,children:Object(x.jsx)("button",{onClick:function(){a(!0),y(!0),console.log("Register clicked")},children:"Register"})}),_?Object(x.jsx)("span",{className:b.a.HeaderTitles,children:Object(x.jsx)("button",{onClick:function(){B(!0)},children:"Logged"})}):Object(x.jsx)("span",{className:b.a.HeaderTitles,children:Object(x.jsx)("button",{onClick:function(){d(!0),y(!0),console.log("Login clicked")},children:"Login "})})]}),s?Object(x.jsx)(p,{onCancel:E,onConfirmRegister:function(){C.a.post("/api/manager/registernewmanager",{firstName:"Herokutest2",lastName:"Herokulastname2",email:"Herokuemail2",password:"1234"}).then((function(e){console.log(e)})).catch((function(e){console.log(e)})),console.log("Register posted")}}):null,s?Object(x.jsx)(v,{onClick:E}):null,o&&Object(x.jsx)(m,{funcUser:function(e){L=e},funcPass:function(e){H=e},onCancel:E,onConfirm:function(){var e=R.find((function(e){return e.email===L}));if(null===e)return console.log("Not found."),0;e.password===H&&(w(!0),d(!1),localStorage.setItem("name",e.firstName),localStorage.setItem("id",e.id),localStorage.setItem("type",e.type),console.log(localStorage.getItem("type")))}}),o&&Object(x.jsx)(v,{onClick:E}),P?Object(x.jsx)(g,{userData:R,onProfileClick:function(){B(!1)},onLogOutClick:function(){w(!1),B(!1)}}):null,P?Object(x.jsx)(v,{onClick:E}):null]})}var k=n(11),_=n.n(k),w=n.p+"static/media/g1009-8.2ecc688c.png";function S(){return Object(x.jsxs)("div",{className:_.a.container,children:[Object(x.jsxs)("div",{className:_.a.searchContainer,style:{backgroundImage:'url("")'},children:[Object(x.jsx)("h1",{children:"Want a fast-food? Search for nearby restaurants!"}),Object(x.jsx)("h1",{children:"Already know what you want? Use the quick search!"}),Object(x.jsxs)("div",{className:_.a.field,children:[Object(x.jsx)("input",{type:"text",placeholder:"Type an address, a place or a will."}),Object(x.jsx)(j.b,{to:"/restaurants",children:Object(x.jsx)("button",{type:"button",className:_.a.fieldButton,children:"Search"})})]})]}),Object(x.jsxs)("div",{className:_.a.AboutUsContainer,children:[Object(x.jsx)("h1",{children:"A new player in the game"}),Object(x.jsx)("div",{children:Object(x.jsxs)("p",{children:[Object(x.jsx)("strong",{children:"Express food"})," is a service design to and for food delivery users.",Object(x.jsx)("p",{children:"Our goal is to provide a fair profit division among all people envolved in the logistic chain than our competitors,"}),Object(x.jsx)("p",{children:"we also aim to give back to comunity throught rewards and advantages for our main supporters, our customers."})]})})]}),Object(x.jsx)("img",{src:w,className:"",alt:"logo",width:"400",height:"500"})]})}var T=n(16),P=n.n(T),B=n.p+"static/media/seal.f81500ea.png";function L(){return Object(x.jsxs)("div",{className:P.a.container,children:[Object(x.jsxs)("div",{children:[Object(x.jsx)("h3",{children:"Stay Connected"}),Object(x.jsx)("input",{type:"text",placeholder:"Subscribe your e-mail"})]}),Object(x.jsxs)("div",{children:[Object(x.jsx)("h3",{children:"CERTIFIED"}),Object(x.jsx)("img",{alt:"Certification",style:{paddingTop:"10px"},src:B})]}),Object(x.jsxs)("div",{children:[Object(x.jsx)("h3",{style:{marginLeft:"40px",marginBottom:"0px"},children:"NAVIGATE"}),Object(x.jsxs)("span",{className:P.a.navigateContainer,children:[Object(x.jsxs)("ul",{style:{marginTop:"0px"},children:[Object(x.jsx)(j.b,{to:"/aboutus",children:Object(x.jsx)("p",{children:"About Us"})}),Object(x.jsx)(j.b,{to:"/ourteam",children:Object(x.jsx)("p",{children:"Our Team"})}),Object(x.jsx)(j.b,{to:"/contactus",children:Object(x.jsx)("p",{children:"Contact"})})]}),Object(x.jsxs)("ul",{style:{marginTop:"0px",marginBottom:"0px"},children:[Object(x.jsx)(j.b,{to:"/careers",children:Object(x.jsx)("p",{children:"Careers"})}),Object(x.jsx)(j.b,{to:"/news",children:Object(x.jsx)("p",{children:"News"})}),Object(x.jsx)(j.b,{to:"/events",children:Object(x.jsx)("p",{children:"Events"})})]})]})]})]})}var H=n(9),R=n.n(H);function E(e){return Object(x.jsxs)("div",{className:R.a.restaurantBox,children:[Object(x.jsx)("img",{alt:"restImage",style:{width:"100px",height:"100px",paddingTop:"20px"}}),Object(x.jsx)("h2",{children:e.name}),Object(x.jsx)("p",{children:e.cuisine}),Object(x.jsx)("p",{children:e.star}),Object(x.jsx)("p",{children:e.price}),Object(x.jsx)("p",{children:e.distance}),Object(x.jsx)("p",{children:e.method}),Object(x.jsx)("p",{children:e.type})]})}function I(e){return Object(x.jsxs)("div",{children:[Object(x.jsx)("div",{children:Object(x.jsx)("input",{type:"text",placeholder:"Type an address, a place or a will."})}),Object(x.jsxs)("div",{className:R.a.container,children:[Object(x.jsxs)("div",{className:R.a.searchOptions,children:[Object(x.jsxs)("select",{children:[Object(x.jsx)("option",{selected:!0,value:"cuisine",children:"Cuisine"}),Object(x.jsx)("option",{value:"italian",children:"Italian"}),Object(x.jsx)("option",{value:"mediterranean",children:"Mediterranean"}),Object(x.jsx)("option",{value:"chinese",children:"Chinese"}),Object(x.jsx)("option",{value:"japanese",children:"Japanese"})]}),Object(x.jsxs)("select",{children:[Object(x.jsx)("option",{selected:!0,value:"1star",children:"Avaliation"}),Object(x.jsx)("option",{value:"2star",children:"1/5"}),Object(x.jsx)("option",{value:"3star",children:"2/5"}),Object(x.jsx)("option",{value:"4star",children:"3/5"}),Object(x.jsx)("option",{value:"5star",children:"4/5"}),Object(x.jsx)("option",{value:"5star",children:"5/5"})]}),Object(x.jsxs)("select",{children:[Object(x.jsx)("option",{selected:!0,value:"distance",children:"Distance"}),Object(x.jsx)("option",{value:"1km",children:"less than 1 KM"}),Object(x.jsx)("option",{value:"5km",children:"less than 5 KM"}),Object(x.jsx)("option",{value:"10km",children:"less than 10 KM"}),Object(x.jsx)("option",{value:"other",children:"more than 10 KM"})]}),Object(x.jsxs)("select",{children:[Object(x.jsx)("option",{selected:!0,value:"method",children:"Withdraw Method"}),Object(x.jsx)("option",{value:"delivary",children:"Delivery"}),Object(x.jsx)("option",{value:"takeaway",children:"Take Away"})]}),Object(x.jsxs)("select",{children:[Object(x.jsx)("option",{selected:!0,value:"priceuisine",children:"Price"}),Object(x.jsx)("option",{value:"cheap",children:"$"}),Object(x.jsx)("option",{value:"abitmore",children:"$$"}),Object(x.jsx)("option",{value:"average",children:"$$$"}),Object(x.jsx)("option",{value:"expensive",children:"$$$$"})]}),Object(x.jsxs)("select",{children:[Object(x.jsx)("option",{selected:!0,value:"type",children:"Type"}),Object(x.jsx)("option",{value:"buffet",children:"Buffet"}),Object(x.jsx)("option",{value:"fastfood",children:"Fast Food"}),Object(x.jsx)("option",{value:"fastcasual",children:"Fast Casual"}),Object(x.jsx)("option",{value:"casual",children:"Casual Dinning"}),Object(x.jsx)("option",{value:"fine",children:"Fine Dinning"})]}),Object(x.jsxs)("span",{className:R.a.SearchButtons,children:[Object(x.jsx)("button",{children:"Promotion"}),Object(x.jsx)("button",{children:"Free Delivery"})]})]}),Object(x.jsx)("div",{className:R.a.restaurantBoxes,children:e.restaurants.map((function(t){return Object(x.jsx)(j.b,{to:t.id,className:R.a.box,children:Object(x.jsx)(E,{restaurants:e.restaurants,name:t.restaurantName,cuisine:t.operatingHours,star:t.restaurantId,distance:t.restaurantAddress,price:t.priceLevel,type:t.restaurantType})})}))})]})]})}function A(){return Object(x.jsx)("div",{children:"About"})}function F(){return Object(x.jsx)("div",{children:"Carrers"})}function D(){return Object(x.jsx)("div",{children:"OurTeam"})}function $(){return Object(x.jsx)("div",{children:"ContactUs"})}function M(){return Object(x.jsx)("div",{children:"News"})}function U(){return Object(x.jsx)("div",{children:"Events"})}var K=n(17),V=n.n(K);function W(e){return Object(x.jsxs)("div",{children:[Object(x.jsx)("h3",{style:{color:"Black"},children:e.foodType}),Object(x.jsxs)("div",{className:V.a.productsSelection,children:[Object(x.jsx)("p",{children:e.product}),Object(x.jsx)("p",{children:e.price}),Object(x.jsxs)("div",{className:V.a.productQuantity,children:[Object(x.jsx)("input",{style:{alignSelf:"center",width:"2em"},type:"number",name:"quantity",value:"0"}),Object(x.jsx)("button",{children:"Add to Cart"}),Object(x.jsx)("hr",{}),Object(x.jsx)("button",{children:"v"})]})]})]})}var J=n(27),G=n.n(J);function q(){var e=Object(c.useState)(!1),t=Object(l.a)(e,2),n=t[0],s=t[1],a=Object(c.useState)(!1),i=Object(l.a)(a,2),r=i[0],j=i[1];return console.log("Ignore "+r),Object(x.jsxs)("div",{className:G.a.Container,children:[n?Object(x.jsx)(f,{onClick:function(){s(!1)}}):null,n?Object(x.jsx)(v,{onClick:function(){s(!1)}}):null,Object(x.jsx)("h3",{children:"SHOPPING CART"}),Object(x.jsx)("span",{style:{paddingLeft:"5px"},children:Object(x.jsx)("button",{onClick:function(){s(!0),j(!0)},children:"Details and Payment"})})]})}function Q(e){var t=Object(o.g)(),n=e.restaurants.find((function(e){return e.id===t.id}));return null==n?0:Object(x.jsxs)("div",{children:[Object(x.jsxs)("div",{style:{display:"flex",padding:"10px",paddingLeft:"40px",paddingTop:"40px"},children:[Object(x.jsx)("img",{alt:"placeImg",src:"",style:{width:"100px",height:"100px"}}),Object(x.jsx)("h1",{style:{paddingLeft:"40px"},children:n.restaurantName})]}),Object(x.jsxs)("div",{style:{display:"flex",justifyContent:"space-around"},children:[Object(x.jsxs)("div",{style:{padding:"20px",width:"70%"},children:[Object(x.jsx)(W,{foodType:"Beverages",product:"coke",price:"$3,00"}),Object(x.jsx)(W,{foodType:"Starters",product:"Risotto",price:"$8,00"}),Object(x.jsx)(W,{foodType:"Pasta",product:"Pizza",price:"$11,00"}),Object(x.jsx)(W,{product:"Lasagna",price:"$15,00"}),Object(x.jsx)(W,{product:"Caneloni",price:"$10,00"}),Object(x.jsx)(W,{foodType:"Deserts",product:"Tiramiss\xfa",price:"$9,00"})]}),Object(x.jsx)("div",{style:{padding:"20px",width:"29%",paddingTop:"83px"},children:Object(x.jsx)(q,{})})]})]})}var z=n.p+"static/media/Daco.94d017cf.png";function Y(){return Object(x.jsxs)("div",{children:[Object(x.jsxs)("div",{children:[Object(x.jsx)("img",{src:z,alt:"",style:{width:"150px",height:"150px",padding:"40px"}}),Object(x.jsx)("img",{src:z,alt:"",style:{width:"150px",height:"150px",padding:"40px"}}),Object(x.jsx)("img",{src:z,alt:"",style:{width:"150px",height:"150px",padding:"40px"}}),Object(x.jsx)("img",{src:z,alt:"",style:{width:"150px",height:"150px",padding:"40px"}})]}),Object(x.jsxs)("div",{style:{display:"flex",justifyContent:"space-evenly"},children:[Object(x.jsx)("span",{children:"1"}),Object(x.jsx)("span",{children:"2"}),Object(x.jsx)("span",{children:"3"}),Object(x.jsx)("span",{children:"4"})]}),Object(x.jsx)("button",{children:"Order Delivered"})]})}function Z(){return Object(x.jsx)("div",{children:"Order History"})}function X(){return Object(x.jsx)("div",{children:"Order Status"})}function ee(e){var t=Object(c.useState)(!1),n=Object(l.a)(t,2),s=n[0],a=n[1],i=Object(c.useState)(!1),r=Object(l.a)(i,2),j=r[0],o=r[1];var d=e.managers.concat(e.consumers).find((function(e){return e.id===localStorage.getItem("id")}));return null==d?(console.log("Not found."),0):(console.log(d),Object(x.jsxs)("div",{style:{display:"flex",justifyContent:"start"},children:[Object(x.jsxs)("div",{style:{display:"block",borderRight:"solid black 1px",padding:"20px",width:"230px",paddingTop:"80px"},children:[Object(x.jsx)("button",{className:b.a.LinkBtn,children:"Change User Information"}),Object(x.jsx)("button",{onClick:function(){a(!0),o(!1)},className:b.a.LinkBtn,children:"See Order History"}),Object(x.jsx)("button",{onClick:function(){o(!0),a(!1)},className:b.a.LinkBtn,children:"See Order Status and Confirm"}),Object(x.jsx)("button",{className:b.a.LinkBtn,children:"Change Profile Settings"}),s?Object(x.jsx)("div",{children:Object(x.jsx)("h3",{children:"Order History"})}):null]}),Object(x.jsxs)("div",{style:{display:"flow-root",justifyContent:"start",paddingTop:"20px",paddingLeft:"40px"},children:[Object(x.jsxs)("h2",{children:["Welcome, ",d.firstName,"."]}),j?Object(x.jsx)(X,{}):null,s?Object(x.jsx)(Z,{}):null]})]}))}function te(){return Object(x.jsxs)("div",{style:{display:"table-caption",padding:"50px"},children:[Object(x.jsx)("p",{children:"image"}),Object(x.jsxs)("label",{children:["Place Name",Object(x.jsx)("input",{type:"text"})]}),Object(x.jsxs)("label",{children:["Address",Object(x.jsx)("input",{type:"text"})]}),Object(x.jsxs)("label",{children:["Operating Hour",Object(x.jsx)("input",{type:"text"})]}),Object(x.jsxs)("label",{children:["Price Average",Object(x.jsx)("input",{type:"text"})]}),Object(x.jsxs)("select",{children:[Object(x.jsx)("option",{value:"Buffet",children:"Type"}),Object(x.jsx)("option",{value:"Buffet",children:"Buffet"}),Object(x.jsx)("option",{value:"FastFood",children:"Fast Food"}),Object(x.jsx)("option",{value:"FastCasual",children:"Fast Casual"}),Object(x.jsx)("option",{value:"CasualDinning",children:"Casual Dinning"}),Object(x.jsx)("option",{value:"FineDinning",children:"Fine Dinning"})]}),Object(x.jsx)("button",{children:"Create Restaurant"})]})}function ne(){return Object(x.jsx)("div",{children:Object(x.jsxs)("div",{style:{display:"table-caption",padding:"50px"},children:[Object(x.jsx)("select",{children:Object(x.jsx)("option",{value:"Restaurant",children:"Luigi\xb4s"})}),Object(x.jsx)("p",{children:"image"}),Object(x.jsxs)("label",{children:["Product Name",Object(x.jsx)("input",{type:"text"})]}),Object(x.jsxs)("label",{children:["Price",Object(x.jsx)("input",{type:"number"})]}),Object(x.jsxs)("label",{children:["Description",Object(x.jsx)("input",{type:"text"})]}),Object(x.jsx)("button",{children:"Add Product"})]})})}function ce(){return Object(x.jsx)("div",{children:"Owner Order History"})}function se(e){var t=Object(c.useState)(!1),n=Object(l.a)(t,2),s=n[0],a=n[1],i=Object(c.useState)(!1),r=Object(l.a)(i,2),j=r[0],o=r[1],d=Object(c.useState)(!1),u=Object(l.a)(d,2),O=u[0],h=u[1],p=Object(c.useState)(!1),m=Object(l.a)(p,2),f=m[0],g=m[1];var v=e.managers.concat(e.consumers).find((function(e){return e.id===localStorage.getItem("id")}));return null==v?(console.log("Not found."),0):(console.log(v),Object(x.jsxs)("div",{style:{display:"flex",justifyContent:"start"},children:[Object(x.jsxs)("div",{style:{display:"block",borderRight:"solid black 1px",padding:"20px",width:"230px",paddingTop:"50px"},children:[Object(x.jsx)("button",{className:b.a.LinkBtn,children:"Change Owner Profile Information"}),Object(x.jsx)("button",{className:b.a.LinkBtn,onClick:function(){a(!0),o(!1),g(!1),h(!1)},children:"Create Place"}),Object(x.jsx)("button",{className:b.a.LinkBtn,onClick:function(){o(!0),a(!1),g(!1),h(!1)},children:"Add Products to Place"}),Object(x.jsx)("button",{className:b.a.LinkBtn,onClick:function(){h(!0),g(!1),o(!1),a(!1)},children:"Order History"}),Object(x.jsx)("button",{className:b.a.LinkBtn,onClick:function(){g(!0),h(!1),o(!1),a(!1)},children:"Receive Order and Change Status"}),Object(x.jsx)("button",{className:b.a.LinkBtn,children:"Owner Profile Settings"})]}),Object(x.jsxs)("div",{children:[Object(x.jsxs)("h2",{children:["Welcome, ",v.firstName,"."]}),s?Object(x.jsx)(te,{}):null,j?Object(x.jsx)(ne,{}):null,f?Object(x.jsx)(X,{}):null,O?Object(x.jsx)(ce,{}):null]})]}))}var ae=n(55);function ie(){var e=Object(c.useState)([]),t=Object(l.a)(e,2),n=t[0],s=t[1];return Object(c.useEffect)((function(){C.a.get("/api/restaurant/all").then((function(e){return s(e.data)})),console.log(n)}),[]),Object(x.jsxs)("div",{children:["Teste",Object(x.jsx)("div",{children:n.map((function(e){return Object(x.jsxs)("div",{style:{display:"flex"},children:[Object(x.jsx)("ul",{children:e.restaurantName}),Object(x.jsx)("ul",{children:e.restaurantAddress}),Object(x.jsx)("ul",{children:e.operatingHours}),Object(x.jsx)("ul",{children:e.restaurantType}),Object(x.jsx)("ul",{children:e.priceLevel})]},e.restaurantId)}))}),Object(x.jsx)("button",{onClick:function(){C.a.post("/api/manager/registernewmanager",{firstName:"Herokutest",lastName:"Herokulastname",email:"Herokuemail",password:"1234"}).then((function(e){console.log(e)})).catch((function(e){console.log(e)})),console.log(n)},children:"Post"})]})}var re=function(e){var t=Object(c.useState)([]),n=Object(l.a)(t,2),s=n[0],a=n[1];Object(c.useEffect)((function(){C.a.get("/api/restaurant/all").then((function(e){return a(e.data)})),console.log(s)}),[]);var i=s.map((function(e){return Object(r.a)(Object(r.a)({},e),{},{id:Object(ae.a)()})})),d=Object(c.useState)([]),b=Object(l.a)(d,2),u=b[0],O=b[1];Object(c.useEffect)((function(){C.a.get("/api/consumer/all").then((function(e){return O(e.data)})),console.log(s)}),[]);var h=u.map((function(e){return Object(r.a)(Object(r.a)({},e),{},{id:Object(ae.a)(),type:"consumer"})})),p=Object(c.useState)([]),m=Object(l.a)(p,2),f=m[0],g=m[1];Object(c.useEffect)((function(){C.a.get("/api/manager/all").then((function(e){return g(e.data)})),console.log(s)}),[]);var v=f.map((function(e){return Object(r.a)(Object(r.a)({},e),{},{id:Object(ae.a)(),type:"manager"})}));return Object(x.jsx)(j.a,{children:Object(x.jsxs)("div",{className:"App",children:[Object(x.jsx)(N,{consumers:h,managers:v}),Object(x.jsxs)(o.c,{children:[Object(x.jsx)(o.a,{path:"/",element:Object(x.jsx)(S,{})}),Object(x.jsx)(o.a,{path:"/restaurants",element:Object(x.jsx)(I,{restaurants:i})}),Object(x.jsx)(o.a,{path:"/restaurants/:id",element:Object(x.jsx)(Q,{restaurants:i})}),Object(x.jsx)(o.a,{path:"/aboutus",element:Object(x.jsx)(A,{})}),Object(x.jsx)(o.a,{path:"/careers",element:Object(x.jsx)(F,{})}),Object(x.jsx)(o.a,{path:"/ourteam",element:Object(x.jsx)(D,{})}),Object(x.jsx)(o.a,{path:"/contactus",element:Object(x.jsx)($,{})}),Object(x.jsx)(o.a,{path:"/news",element:Object(x.jsx)(M,{})}),Object(x.jsx)(o.a,{path:"/events",element:Object(x.jsx)(U,{})}),Object(x.jsx)(o.a,{path:"/orderconfirmation",element:Object(x.jsx)(Y,{})}),Object(x.jsx)(o.a,{path:"/consumer/:id",element:Object(x.jsx)(ee,{consumers:h,managers:v})}),Object(x.jsx)(o.a,{path:"/manager/:id",element:Object(x.jsx)(se,{consumers:h,managers:v})}),Object(x.jsx)(o.a,{path:"/test",element:Object(x.jsx)(ie,{})})]}),Object(x.jsx)(L,{})]})})},le=function(e){e&&e instanceof Function&&n.e(3).then(n.bind(null,56)).then((function(t){var n=t.getCLS,c=t.getFID,s=t.getFCP,a=t.getLCP,i=t.getTTFB;n(e),c(e),s(e),a(e),i(e)}))};i.a.render(Object(x.jsx)(s.a.StrictMode,{children:Object(x.jsx)(re,{})}),document.getElementById("root")),le()},9:function(e,t,n){e.exports={container:"SearchView_container__1EJnP",SearchButtons:"SearchView_SearchButtons__1ecG0",box:"SearchView_box__2f1y2",restaurantBoxes:"SearchView_restaurantBoxes__2E9OF",searchOptions:"SearchView_searchOptions__3qvyG",restaurantBox:"SearchView_restaurantBox__e7Y56"}}},[[53,1,2]]]);
//# sourceMappingURL=main.29146ffb.chunk.js.map