
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import BookingManager from "./components/listers/BookingCards"
import BookingDetail from "./components/listers/BookingDetail"

import DriverManager from "./components/listers/DriverCards"
import DriverDetail from "./components/listers/DriverDetail"

import FeedbackManager from "./components/listers/FeedbackCards"
import FeedbackDetail from "./components/listers/FeedbackDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/bookings',
                name: 'BookingManager',
                component: BookingManager
            },
            {
                path: '/bookings/:id',
                name: 'BookingDetail',
                component: BookingDetail
            },

            {
                path: '/drivers',
                name: 'DriverManager',
                component: DriverManager
            },
            {
                path: '/drivers/:id',
                name: 'DriverDetail',
                component: DriverDetail
            },

            {
                path: '/feedbacks',
                name: 'FeedbackManager',
                component: FeedbackManager
            },
            {
                path: '/feedbacks/:id',
                name: 'FeedbackDetail',
                component: FeedbackDetail
            },



    ]
})
