# mockirke

Brings up a mocked RestAPI, from a simple configuration file

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
    