        <footer id="footer">
            <div class="section global-map-area">
                <div class="container">
                    <div class="row add-clearfix">
                        <div class="col-sm-6 col-md-3">
                            <div class="icon-box style6 small-box">
                                <i class="soap-icon-friends"></i>
                                <div class="description">
                                    <h4>Plan Your Tours</h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="icon-box style6 animated small-box">
                                <i class="soap-icon-insurance"></i>
                                <div class="description">
                                    <h4>Low Rate Packages</h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="icon-box style6 animated small-box">
                                <i class="soap-icon-insurance"></i>
                                <div class="description">
                                    <h4>Travel Insurance</h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="icon-box style6 animated small-box">
                                <i class="soap-icon-guideline"></i>
                                <div class="description">
                                    <h4>Travel Guidelines</h4>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </div>
<!-- Javascript -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.noconflict.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/modernizr.2.7.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-migrate-1.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.placeholder.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-ui.1.10.4.min.js"></script>
    
    <!-- Twitter Bootstrap -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
    
    <!-- load revolution slider scripts -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/revolution_slider/js/jquery.themepunch.tools.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/revolution_slider/js/jquery.themepunch.revolution.min.js"></script>
    
    <!-- load BXSlider scripts -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/components/jquery.bxslider/jquery.bxslider.min.js"></script>
    
    <!-- parallax -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery.stellar.min.js"></script>
    
    <!-- waypoint -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/waypoints.min.js"></script>

    <!-- load page Javascript -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/theme-scripts.js"></script>

    <script type="text/javascript">
        tjq("#slideshow .flexslider").flexslider({
            animation: "fade",
            controlNav: false,
            animationLoop: true,
            directionNav: false,
            slideshow: true,
            slideshowSpeed: 5000
        });
    </script>
        
    <script type="text/javascript">
        tjq(document).ready(function() {
            tjq("#price-range").slider({
                range: true,
                min: 0,
                max: 1000,
                values: [ 100, 800 ],
                slide: function( event, ui ) {
                    tjq(".min-price-label").html( "$" + ui.values[ 0 ]);
                    tjq(".max-price-label").html( "$" + ui.values[ 1 ]);
                }
            });
            tjq(".min-price-label").html( "$" + tjq("#price-range").slider( "values", 0 ));
            tjq(".max-price-label").html( "$" + tjq("#price-range").slider( "values", 1 ));
            
            tjq("#rating").slider({
                range: "min",
                value: 40,
                min: 0,
                max: 50,
                slide: function( event, ui ) {
                    
                }
            });
        });
    </script>