/* global Chart:false */

$(function () {
    'use strict'

    var ticksStyle = {
        fontColor: '#495057',
        fontStyle: 'bold'
    }

    var mode = 'index'
    var intersect = true

    var $salesChart = $('#sales-chart')
    // eslint-disable-next-line no-unused-vars
    var salesChart = new Chart($salesChart, {
        type: 'bar',
        data: {
            labels: ['JUN', 'JUL', 'AUG', 'SEP', 'OCT', 'NOV', 'DEC'],
            datasets: [
                {
                    backgroundColor: '#007bff',
                    borderColor: '#007bff',
                    data: [1000, 2000, 3000, 2500, 2700, 2500, 3000]
                },
                {
                    backgroundColor: '#ced4da',
                    borderColor: '#ced4da',
                    data: [700, 1700, 2700, 2000, 1800, 1500, 2000]
                }
            ]
        },
        options: {
            maintainAspectRatio: false,
            tooltips: {
                mode: mode,
                intersect: intersect
            },
            hover: {
                mode: mode,
                intersect: intersect
            },
            legend: {
                display: false
            },
            scales: {
                yAxes: [{
                        // display: false,
                        gridLines: {
                            display: true,
                            lineWidth: '4px',
                            color: 'rgba(0, 0, 0, .2)',
                            zeroLineColor: 'transparent'
                        },
                        ticks: $.extend({
                            beginAtZero: true,

                            // Include a dollar sign in the ticks
                            callback: function (value) {
                                if (value >= 1000) {
                                    value /= 1000
                                    value += 'k'
                                }

                                return '$' + value
                            }
                        }, ticksStyle)
                    }],
                xAxes: [{
                        display: true,
                        gridLines: {
                            display: false
                        },
                        ticks: ticksStyle
                    }]
            }
        }
    })
    var date = new Date();
    const thisWeek = document.getElementById("thisWeek").value.split(",");
    const lastWeek = document.getElementById("lastWeek").value.split(",");
    const thisWeekNum = thisWeek.map((i) => Number(i));
    const lastWeekNum = lastWeek.map((i) => Number(i));
    var $visitorsChart = $('#visitors-chart');
    var max1 = Math.max.apply(Math, thisWeekNum);
    var max2 = Math.max.apply(Math, lastWeekNum);
    var max = Math.max(max1, max2);
    const reducer = (previousValue, currentValue) => previousValue + currentValue;
    const sum1 = thisWeekNum.reduce(reducer);
    const sum2 = lastWeekNum.reduce(reducer);
    var percent = sum1 / sum2 * 100;
    if (percent > 10000000) {
        percent = 1000;
    }
     document.getElementById("num-user").innerHTML = sum1;
    var textPercent = document.getElementById("text-percent");
    if (max1 < max2) {
        textPercent.className = "text-danger";
    } else {
        textPercent.className = "text-success";
    }

    console.log(sum1 + "" + sum2)
    document.getElementById("percent").innerHTML = percent;
//    console.log(max)
    const arr7Day = [];
    for (var j = 0; j < 7; j++) {
        var last1 = new Date(date.getTime() - ((6 - j) * 24 * 60 * 60 * 1000));
        var day1 = last1.getDate();
        var month1 = last1.getMonth() + 1;
        var year1 = last1.getFullYear();
        arr7Day.push(day1 + "/" + month1 + "/" + year1);
    }
    // eslint-disable-next-line no-unused-vars
    var visitorsChart = new Chart($visitorsChart, {
        data: {
            labels: arr7Day,
            datasets: [{
                    type: 'line',
                    data: thisWeek,
                    backgroundColor: 'transparent',
                    borderColor: '#007bff',
                    pointBorderColor: '#007bff',
                    pointBackgroundColor: '#007bff',
                    fill: false
                            // pointHoverBackgroundColor: '#007bff',
                            // pointHoverBorderColor    : '#007bff'
                },
                {
                    type: 'line',
                    data: lastWeek,
                    backgroundColor: 'tansparent',
                    borderColor: '#ced4da',
                    pointBorderColor: '#ced4da',
                    pointBackgroundColor: '#ced4da',
                    fill: false
                            // pointHoverBackgroundColor: '#ced4da',
                            // pointHoverBorderColor    : '#ced4da'
                }]
        },
        options: {
            maintainAspectRatio: false,
            tooltips: {
                mode: mode,
                intersect: intersect
            },
            hover: {
                mode: mode,
                intersect: intersect
            },
            legend: {
                display: false
            },
            scales: {
                yAxes: [{
                        // display: false,
                        gridLines: {
                            display: true,
                            lineWidth: '4px',
                            color: 'rgba(0, 0, 0, .2)',
                            zeroLineColor: 'transparent'
                        },
                        ticks: $.extend({
                            beginAtZero: true,
                            suggestedMax: max
                        }, ticksStyle)
                    }],
                xAxes: [{
                        display: true,
                        gridLines: {
                            display: false
                        },
                        ticks: ticksStyle
                    }]
            }
        }
    })
})

// lgtm [js/unused-local-variable]
