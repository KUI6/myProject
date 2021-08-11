module.exports = {
    lintOnSave: false,
/*    devServer: {
        port: 500,
        proxy: {
            '/constrast': {
                target: 'http://localhost:501', //mock API接口系统
                ws: false,
                changeOrigin: true,
                pathRewrite: {
                    '^/constrast': ''
                }
            },
        }
    }*/

    devServer: {
        port: 3000,
        proxy: {
            '/constrast': {
                target: 'http://localhost:501', //mock API接口系统
                ws: false,
                changeOrigin: true,
                pathRewrite: {
                    '^/constrast': ''
                }
            }
        }
    },
    }
