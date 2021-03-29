[![master](https://github.com/eferraris/mockirke/actions/workflows/master.yml/badge.svg)](https://github.com/eferraris/mockirke/actions/workflows/master.yml)

# mockirke

Brings up a mocked RESTful API, from a simple configuration file

    $HOME/mapping.json
    [
        {
            "path": "/getSomething",
            "method": "GET",
            "content": {
                "name": "whats this",
                "description": "this is a description"
            }
        },
        {
            "path": "/api/v1/doPost",
            "method": "POST",
            "content": {
                "name": "yes!",
                "others": [
                    {
                        "name": "asd",
                        "image": "/home/asd.jpg"
                    }
                ]
            }
        }
    ]
    
