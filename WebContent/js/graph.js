(function($) {
	
	"use strict";
	
	var data = {
    labels: ["2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"],
    datasets: [{
        backgroundColor: "rgba(3,199,217,0.8)",
        borderColor: "rgba(75,192,192,1)",
        data: [2000, 2500, 1500, 3500, 2200, 2800, 3000, 4000, 3500, 5500, 6800],
    }]
};

var ctx = document.getElementById("analysis-graph");
Chart.defaults.global.legend.display = false;
var myChart = new Chart(ctx, {
    type: 'bar',
    data: data,
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: true
                }
            }],
            xAxes: [{
                // Change here
            	barPercentage: 1
            }]
        }
    }
});

console.log(myChart);
	

})(window.jQuery);