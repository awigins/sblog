<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="zh">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>响应式简单个性个人博客模板</title>
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" type="text/css" href="statics/css/index.css" media="all" />
	</head>

	<body class="home blog custom-background round-avatars">
		<div class="Yarn_Background" style="background-image: url( statics/images/47fb3c_.jpg);"></div>
		<form class="js-search search-form search-form--modal" method="get" action="search.jsp" role="search">
			<div class="search-form__inner">
				<div>
					<div id="search-container" class="ajax_search">
						<form method="get" id="searchform" action="">
							<div class="filter_container"><input type="text" value="" autocomplete="off" placeholder="Type then select or enter" name="s" id="search-input" />
								<ul id="search_filtered" class="search_filtered"></ul>
							</div>
							<input type="submit" name="submit" id="searchsubmit" class="searchsubmit" value="" />
						</form>
					</div>
				</div>
			</div>
		</form>
		<div class="navi" data-aos="fade-down">
			<div class="bt-nav">
				<div class="line line1"></div>
				<div class="line line2"></div>
				<div class="line line3"></div>
			</div>
			<div class="navbar animated fadeInRight">
				<div class="inner">
					<nav id="site-navigation" class="main-navigation">
						<div id="main-menu" class="main-menu-container">
							<div class="menu-menu-container">
								<ul id="primary-menu" class="menu">
									<li id="menu-item-17" class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home menu-item-17">
										<a href="index">首页</a>
									</li>
									<li id="menu-item-173" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-173">
										<a href="hot">站内热门</a>
									</li>
									<li id="menu-item-57" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-57">
										<a href="LiuYan.jsp">倾听世界</a>
									</li>
									<li id="menu-item-78" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-78">
										<a href="link">我的关注</a>
									</li>
									<li id="menu-item-252" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-252">
										<a href="GeRenZhuYe.jsp">后台系统</a>
										<ul class="sub-menu">
											<li id="menu-item-165" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-165">
												<a href="">theme</a>
											</li>
											<li id="menu-item-163" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-163">
												<a href="">Happen</a>
											</li>
											<li id="menu-item-924" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-924">
												<a href="">WeWork</a>
											</li>
											<li id="menu-item-164" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-164">
												<a href="">WordPress</a>
											</li>
										</ul>
									</li>
								</ul>
							</div>
						</div>
					</nav>
					<!-- #site-navigation -->
				</div>
			</div>
		</div>
		<div class="hebin" data-aos="fade-down">
			<i class=" js-toggle-search iconfont">&#xe60e;</i>
		</div>
		<header id="masthead" class="overlay animated from-bottom" itemprop="brand">
			<div class="site-branding text-center">
				<a href="">
					<figure>
						<img class="custom-logo avatar" src="statics/images/omikron.png" />
					</figure>
				</a>
				<h3 class="blog-description"><p>This is beauty</p></h3>
			</div>
			<!-- .site-branding -->
			<div class="decor-part">
				<div id="particles-js"></div>
			</div>
			<div class="animation-header">
				<div class="decor-wrapper">
					<svg id="header-decor" class="decor bottom" xmlns="http://www.w3.org/2000/svg" version="1.1" viewBox="0 0 100 100" preserveAspectRatio="none">
						<path class="large left" d="M0 0 L50 50 L0 100" fill="rgba(255,255,255, .1)"></path>
						<path class="large right" d="M100 0 L50 50 L100 100" fill="rgba(255,255,255, .1)"></path>
						<path class="medium left" d="M0 100 L50 50 L0 33.3" fill="rgba(255,255,255, .3)"></path>
						<path class="medium right" d="M100 100 L50 50 L100 33.3" fill="rgba(255,255,255, .3)"></path>
						<path class="small left" d="M0 100 L50 50 L0 66.6" fill="rgba(255,255,255, .5)"></path>
						<path class="small right" d="M100 100 L50 50 L100 66.6" fill="rgba(255,255,255, .5)"></path>
						<path d="M0 99.9 L50 49.9 L100 99.9 L0 99.9" fill="rgba(255,255,255, 1)"></path>
						<path d="M48 52 L50 49 L52 52 L48 52" fill="rgba(255,255,255, 1)"></path>
					</svg>
				</div>
			</div>
		</header>
		<div id="main" class="content">
			<div class="container">
				<section class="post_content" itemscope itemtype="http://schema.org/Article">
					<header class="post_header">
						<h2 class="post_title">简介: 这个人很懒，什么也没有留下</h2>
						<h1>归档</h1>
					</header>
					<div class="post-Archive">
						<div id="archives">
							<div class='archive-title' id='arti-2018-3'>
								<h3>2018-3</h3>
								<div class='archives archives-3' data-date='2018-3'>
									<div class="brick">
										<a href=""><span class="time">3-20</span>交代是不可能交代的<span>(0)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-12'>
								<h3>2017-12</h3>
								<div class='archives archives-12' data-date='2017-12'>
									<div class="brick">
										<a href=""><span class="time">12-30</span>我才不会写年终总结之瞎说篇<span>(31)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">12-25</span>状态<span>(12)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-11'>
								<h3>2017-11</h3>
								<div class='archives archives-11' data-date='2017-11'>
									<div class="brick">
										<a href=""><span class="time">11-13</span>重构图像样式测试<span>(26)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-10'>
								<h3>2017-10</h3>
								<div class='archives archives-10' data-date='2017-10'>
									<div class="brick">
										<a href=""><span class="time">10-02</span>给大家介绍一下<span>(30)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-9'>
								<h3>2017-9</h3>
								<div class='archives archives-9' data-date='2017-9'>
									<div class="brick">
										<a href=""><span class="time">9-06</span>《别哭妈妈》<span>(4)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">9-03</span>再一次一周年<span>(19)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-7'>
								<h3>2017-7</h3>
								<div class='archives archives-7' data-date='2017-7'>
									<div class="brick">
										<a href=""><span class="time">7-30</span>姗姗来迟和意料之中<span>(27)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-6'>
								<h3>2017-6</h3>
								<div class='archives archives-6' data-date='2017-6'>
									<div class="brick">
										<a href=""><span class="time">6-21</span>WordPress引用外部文章链接功能<span>(9)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">6-21</span>代码高亮使用指南<span>(7)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">6-21</span>新版排版样式更换<span>(0)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">6-09</span>你可能不信我回来了<span>(12)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-4'>
								<h3>2017-4</h3>
								<div class='archives archives-4' data-date='2017-4'>
									<div class="brick">
										<a href=""><span class="time">4-25</span>不断的坏事<span>(22)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-3'>
								<h3>2017-3</h3>
								<div class='archives archives-3' data-date='2017-3'>
									<div class="brick">
										<a href=""><span class="time">3-24</span>闲事莫理<span>(27)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">3-24</span>毒鸡汤也是一碗鸡汤<span>(3)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">3-16</span>震惊，后期剪辑师被用作微信编辑<span>(13)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2017-1'>
								<h3>2017-1</h3>
								<div class='archives archives-1' data-date='2017-1'>
									<div class="brick">
										<a href=""><span class="time">1-27</span>新春踢楼赢红包「活动」-已结束<span>(35)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2016-12'>
								<h3>2016-12</h3>
								<div class='archives archives-12' data-date='2016-12'>
									<div class="brick">
										<a href=""><span class="time">12-08</span>WORDPRESS 4.7 更新亮点自寻<span>(15)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">12-07</span>得壹「賞」貳不是夢<span>(18)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2016-11'>
								<h3>2016-11</h3>
								<div class='archives archives-11' data-date='2016-11'>
									<div class="brick">
										<a href=""><span class="time">11-22</span>致歉或说明<span>(16)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">11-02</span>每日瞎扯<span>(12)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2016-10'>
								<h3>2016-10</h3>
								<div class='archives archives-10' data-date='2016-10'>
									<div class="brick">
										<a href=""><span class="time">10-31</span>缺钱体质<span>(19)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">10-31</span>WordPress 文章内链功能<span>(7)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">10-26</span>关于域名授权<span>(10)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">10-19</span>强迫症<span>(12)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">10-19</span>关于购买Yarn<span>(101)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">10-12</span>You always really nice<span>(0)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">10-03</span>我藏好了哦<span>(25)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">10-01</span>样式测试<span>(7)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2016-9'>
								<h3>2016-9</h3>
								<div class='archives archives-9' data-date='2016-9'>
									<div class="brick">
										<a href=""><span class="time">9-25</span>东离剑游纪<span>(17)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">9-23</span>平淡面试流水账<span>(15)</span></a>
									</div>
									<div class="brick">
										<a href=""><span class="time">9-19</span>感觉身体被掏空<span>(24)</span></a>
									</div>
								</div>
							</div>
							<div class='archive-title' id='arti-2016-8'>
								<h3>2016-8</h3>
								<div class='archives archives-8' data-date='2016-8'>
									<div class="brick">
										<a href=""><span class="time">8-15</span>世界，您好！<span>(10)</span></a>
									</div>
								</div>
							</div>
						</div>
				</section>
				</div>
			</div>

			<footer id="footer" class="overlay animated from-top">
				<div class="decor-wrapper">
					<svg id="footer-decor" class="decor top" xmlns="http://www.w3.org/2000/svg" version="1.1" viewBox="0 0 100 100" preserveAspectRatio="none">
						<path class="large left" d="M0 0 L50 50 L0 100" fill="rgba(255,255,255, .1)"></path>
						<path class="large right" d="M100 0 L50 50 L100 100" fill="rgba(255,255,255, .1)"></path>
						<path class="medium left" d="M0 0 L50 50 L0 66.6" fill="rgba(255,255,255, .3)"></path>
						<path class="medium right" d="M100 0 L50 50 L100 66.6" fill="rgba(255,255,255, .3)"></path>
						<path class="small left" d="M0 0 L50 50 L0 33.3" fill="rgba(255,255,255, .5)"></path>
						<path class="small right" d="M100 0 L50 50 L100 33.3" fill="rgba(255,255,255, .5)"></path>
						<path d="M0 0 L50 50 L100 0 L0 0" fill="rgba(255,255,255, 1)"></path>
						<path d="M48 48 L50 51 L52 48 L48 48" fill="rgba(255,255,255, 1)"></path>
					</svg>
				</div>

				<div class="socialize" data-aos="zoom-in">
					<li>
						<a title="weibo" class="socialicon" href=""><i class="iconfont" aria-hidden="true">&#xe601;</i></a>
					</li>
					<li class="wechat">
						<a class="socialicon"><i class="iconfont">&#xe609;</i></a>
						<div class="wechatimg"><img src="statics/images/49D3746D-7519-B709-83E4-65BD1927C4E7.jpg"></div>
					</li>
					<li>
						<a title="QQ" class="socialicon" href="" target="_blank"><i class="iconfont" aria-hidden="true">&#xe616;</i></a>
					</li>
				</div>

				<div class="cr">
					Copyright&copy;2020. Design by
					<a href="">XXX</a>
				</div>
				<script type='text/javascript' src='statics/js/JQuery.js'></script>
				<script type='text/javascript' src='statics/js/plugins.js'></script>
				<script type='text/javascript' src='statics/js/script.js'></script>
				<script type='text/javascript' src='statics/js/particles.js'></script>
				<script type='text/javascript' src='statics/js/aos.js'></script>

	</body>

</html>