

#ifndef MAINWIDGET_H
#define MAINWIDGET_H
#include <QLabel>
#include <QWidget>
#include <QLineEdit>
class QPushButton;
class QTextBrowser;

// This is the declaration of our MainWidget class
class widget : public QWidget
{
    Q_OBJECT

public:
    explicit widget(QWidget *parent = 0); // Constructor
    ~widget();                            // Destructor

private slots:

private:
    QLabel *m_labelname[2];
    QLineEdit *m_textname[2];
    QPushButton *m_button_;
};

#endif // MAINWIDGET_H