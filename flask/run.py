from website import create_app

app = create_app()
'''
if __name__ == '__main__':
    app.run(debug=True)
'''

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)

'''
if __name__ == "__main__":
	app.config['SECRET_KEY'] = 'wcsfeufhwiquehfdx' 
	csrf = CSRFProtect()
	csrf.init_app(app)
'''